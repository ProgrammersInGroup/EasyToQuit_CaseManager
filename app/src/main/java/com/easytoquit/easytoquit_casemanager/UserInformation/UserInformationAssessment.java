package com.easytoquit.easytoquit_casemanager.UserInformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.GlobalVariable;
import com.easytoquit.easytoquit_casemanager.RetreiveData.SmokeStatus;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserInformationAssessment extends AppCompatActivity {

    TextView show_smoking_year;
    TextView show_week_smoking;
    TextView show_date_smoking;
    TextView show_quit_smoking_date;
    TextView show_smoking_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information_assessment);
        setTitle("戒菸者評估資料");

        final String TAG="Status";
        show_smoking_year = (TextView)findViewById(R.id.show_smoking_year) ;
//        show_week_smoking = (TextView)findViewById(R.id.show_week_smoking) ;
        show_date_smoking = (TextView)findViewById(R.id.show_date_smoking) ;
        show_quit_smoking_date = (TextView)findViewById(R.id.show_quit_smoking_date) ;
        show_smoking_money = (TextView)findViewById(R.id.show_smoking_money) ;

        GlobalVariable gv = (GlobalVariable)getApplicationContext();
        String userPhone = gv.getPhone();

        FirebaseDatabase database = FirebaseDatabase.getInstance("https://wedproject-d750d.firebaseio.com/");
        DatabaseReference myRef = database.getReference("usersAssessment/" + userPhone +"/評估資料/"+"第一次評估資料");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                /*User user = dataSnapshot.getValue(User.class);
                // [START_EXCLUDE]
                Log.d(TAG, "Value is: " + user);*/
                SmokeStatus value = dataSnapshot.getValue(SmokeStatus.class);
                show_smoking_year.setText(value.getsmokeage());
//                show_week_smoking.setText(value.getsmokehowmuchweek());
                show_date_smoking.setText(value.getsmokehowmuchday());
                show_quit_smoking_date.setText(value.getsmokequitday());
                show_smoking_money.setText(value.getsmokemoney());
                Log.d(TAG, "Value is: " + value.getsmokeage());
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
    }
}
