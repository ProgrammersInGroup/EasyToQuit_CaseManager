package com.easytoquit.easytoquit_casemanager.mFragment;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.easytoquit.easytoquit_casemanager.Insertion.InsertProfile;
import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class Profile extends Fragment {
    private static final String TAG = "MainActivity";
    TextView name;
    TextView gender;
    TextView age;
    TextView phone;
    private ImageButton editbt;
    CircleImageView profile_image;
    String BitmapString;
    Bitmap mBitmapImage;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);
        name = (TextView)view.findViewById(R.id.name) ;
        gender = (TextView)view.findViewById(R.id.gender) ;
        age = (TextView)view.findViewById(R.id.age) ;
        phone = (TextView)view.findViewById(R.id.phone) ;
        profile_image = (CircleImageView) view.findViewById(R.id.profile_image);
        editbt = (ImageButton)view.findViewById(R.id.imageButton);
        editbt.setOnClickListener(onclick);

        //讀出檔案
        FileInputStream fis = null;
        StringBuilder sb = new StringBuilder();
        try{
            fis = getActivity().openFileInput("note.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            while ((str = br.readLine())!=null){
                sb.append(str);
            }
            br.close();
            isr.close();
            fis.close();
        }catch (Exception e){
            Log.e("Internal",  e.toString() );
        }

        FirebaseDatabase database = FirebaseDatabase.getInstance("https://wedproject-d750d.firebaseio.com/");
        //改為用暫存檔讀取資料庫
        DatabaseReference myRef = database.getReference("CaseManager/" + sb);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                /*User user = dataSnapshot.getValue(User.class);
                // [START_EXCLUDE]
                Log.d(TAG, "Value is: " + user);*/
                User value = dataSnapshot.getValue(User.class);
                name.setText(value.getName());
                age.setText(value.getAge());
                gender.setText(value.getGender());
                phone.setText(value.getPhone());
                Log.d(TAG, "Value is: " + value.getName());
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
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // [START_EXCLUDE]
               /* Toast.makeText(Profile.this, "Failed to load post.",
                        Toast.LENGTH_SHORT).show();*/
                // [END_EXCLUDE]
            }
        });
        return view;
    }
    private View.OnClickListener onclick = new View.OnClickListener() {

        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),InsertProfile.class);
            startActivity(intent);


        }

    };
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("個人檔案");
    }
    public Bitmap getBitmap(String x){

        byte[] bitmapArray;
        bitmapArray = Base64.decode(x,Base64.DEFAULT);
        Bitmap bmp = BitmapFactory.decodeByteArray(bitmapArray
                , 0 , bitmapArray.length);
        return bmp;


    }
}
