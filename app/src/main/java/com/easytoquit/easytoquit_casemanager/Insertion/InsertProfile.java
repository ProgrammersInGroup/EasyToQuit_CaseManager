package com.easytoquit.easytoquit_casemanager.Insertion;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.easytoquit.easytoquit_casemanager.MainActivity;
import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import de.hdodenhof.circleimageview.CircleImageView;

public class InsertProfile extends AppCompatActivity {

    private Button button;
    EditText name;
    EditText gender;
    EditText age;
    EditText phone;
    String BitmapString;
    CircleImageView add, profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_profile);

        name = (EditText)findViewById(R.id.name);
        gender = (EditText)findViewById(R.id.gender);
        age = (EditText)findViewById(R.id.age);
        phone = (EditText)findViewById(R.id.phone);
        button = (Button)findViewById(R.id.ok);
        add = (CircleImageView)findViewById(R.id.add);
        profile_image = (CircleImageView)findViewById(R.id.profile_image);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image();
            }
        });
        button.setOnClickListener(onclick);
        setTitle("新增基本資料");
    }
    public void Image(){
        //init ui
        //make an intent to the photoviewer
        Intent photoIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //go to the event
        //using start activity for result
        startActivityForResult(photoIntent, 1/*use this int to check if the intent returning is the one you sent*/);
    }

    private View.OnClickListener onclick = new View.OnClickListener() {

        public void onClick(View v) {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();

            //加入防呆功能 所有edittext不可為空
            if (name.getText().toString().matches("") ||
                    gender.getText().toString().matches("") ||
                    age.getText().toString().matches("") ||
                    phone.getText().toString().matches("")) {
                Toast toast = Toast.makeText(InsertProfile.this, "欄位不能是空白!!", Toast.LENGTH_LONG);
                toast.show();
            } else {
                User user = new User(name.getText().toString(), age.getText().toString(),
                        gender.getText().toString(), phone.getText().toString(),BitmapString);
                myRef.child("CaseManager").child(phone.getText().toString()).setValue(user);

                // 檔案寫入功能 note.txt為檔名 以phone為輸入值
                FileOutputStream fos = null;
                try {
                    fos = openFileOutput("note.txt", Context.MODE_PRIVATE);
                    fos.write(phone.getText().toString().getBytes());
                    fos.close();
                } catch (Exception e) {
                    Log.e("Internal", e.toString());
                }


                Intent intent = new Intent(InsertProfile.this, MainActivity.class);
                intent.putExtra("id", 1);
                intent.putExtra("false", false);
                startActivity(intent);

            }


        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //validate the intent
        if(requestCode == 1 && resultCode == RESULT_OK && data != null)
        {
            //collect the returned iMage
            try {
                /*Bundle bundle = data.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, outputStream);
                image_data = outputStream.toByteArray();*/
                Uri selectedImage = data.getData();
                Bitmap mBitmapImage = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
                //lets put the image in the image view
                //Bitmap d = new BitmapDrawable(this.getResources() , selectedImage).getBitmap();
                int nh = (int) ( mBitmapImage.getHeight() * (512.0 / mBitmapImage.getWidth()) );
                Bitmap scaled = Bitmap.createScaledBitmap(mBitmapImage, 512, nh, true);
                profile_image.setImageBitmap(scaled);
                Log.d("aa","aa");
                ByteArrayOutputStream bitaos = new ByteArrayOutputStream();
                scaled.compress(Bitmap.CompressFormat.PNG,100,bitaos);
                byte[] bytes=bitaos.toByteArray();


                BitmapString = Base64.encodeToString(bytes,Base64.DEFAULT);
                /*GlobalVariable gv = (GlobalVariable)getApplicationContext();
                gv.setProfileImage(scaled);*/


            }
            catch(Exception e)
            {
                Toast.makeText(this, "No Catch", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        }else
        {
            Toast.makeText(this, "No Result", Toast.LENGTH_LONG).show();
        }

    }

}
