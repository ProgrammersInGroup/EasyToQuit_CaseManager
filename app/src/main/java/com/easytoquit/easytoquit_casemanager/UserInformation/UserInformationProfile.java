package com.easytoquit.easytoquit_casemanager.UserInformation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.GlobalVariable;
import com.easytoquit.easytoquit_casemanager.RetreiveData.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserInformationProfile extends AppCompatActivity {

    TextView name;
    TextView gender;
    TextView age;
    TextView phone;
    CircleImageView profile_image;
    String BitmapString;
    Bitmap mBitmapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information_profile);
        setTitle("戒菸者基本資料");
        name = (TextView)findViewById(R.id.name) ;
        gender = (TextView)findViewById(R.id.gender) ;
        age = (TextView)findViewById(R.id.age) ;
        phone = (TextView)findViewById(R.id.phone) ;
        profile_image = (CircleImageView)findViewById(R.id.profile_image);

        GlobalVariable gv = (GlobalVariable)getApplicationContext();
        String userPhone = gv.getPhone();

        Log.d("aa", "get: " + userPhone);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users/" + userPhone);


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                User value = dataSnapshot.getValue(User.class);
                name.setText(value.getName());
                age.setText(value.getAge());
                gender.setText(value.getGender());
                phone.setText(value.getPhone());
                Log.d("aa", "Value is: " + value.getName());
                BitmapString = value.getBitmapString();
                mBitmapImage=getBitmap(BitmapString);
                //lets put the image in the image view
                //Bitmap d = new BitmapDrawable(this.getResources() , selectedImage).getBitmap();
                int nh = (int) ( mBitmapImage.getHeight() * (512.0 / mBitmapImage.getWidth()) );
                Bitmap scaled = Bitmap.createScaledBitmap(mBitmapImage, 512, nh, true);
                profile_image.setImageBitmap(scaled);

                /*Bitmap bitmapimage = new Intent().getExtras().getParcelable("BitmapImage");
                profile_image.setImageBitmap(bitmapimage);*/
                /*GlobalVariable gv = (GlobalVariable)getActivity().getApplicationContext();
                profile_image.setImageBitmap(gv.getProfile_image());*/

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("aa", "Failed to read value.", error.toException());
            }
        });
    }
    public Bitmap getBitmap(String x){

        byte[] bitmapArray;
        bitmapArray = Base64.decode(x,Base64.DEFAULT);
        Bitmap bmp = BitmapFactory.decodeByteArray(bitmapArray
                , 0 , bitmapArray.length);
        return bmp;


    }
}
