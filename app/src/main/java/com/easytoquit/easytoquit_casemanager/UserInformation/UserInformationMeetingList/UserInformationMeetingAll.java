package com.easytoquit.easytoquit_casemanager.UserInformation.UserInformationMeetingList;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.GlobalVariable;
import com.easytoquit.easytoquit_casemanager.RetreiveData.MeetingAllUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserInformationMeetingAll extends AppCompatActivity {

    TextView name, id, birth, age, case1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information_meeting_all);
        setTitle("戒菸者總表");

        name = (TextView)findViewById(R.id.txt_name);
        id = (TextView)findViewById(R.id.txt_id);
        birth = (TextView)findViewById(R.id.txt_birth);
        age = (TextView)findViewById(R.id.txt_age);
        case1 = (TextView)findViewById(R.id.txt_case);


        GlobalVariable gv = (GlobalVariable)getApplicationContext();
        String userPhone = gv.getPhone();


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users/" + userPhone + "/訪談紀錄/總表/");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                MeetingAllUser value = dataSnapshot.getValue(MeetingAllUser.class);
                name.setText(value.getname());
                id.setText(value.getedt_id());
                birth.setText(value.getedt_birthday());
                age.setText(value.getedt_age());

                String caseResult = null;

                if (value.getrbtn_outpatient() != null){
                    caseResult = value.getrbtn_outpatient();
                }
                else if (value.getrbtn_inpatient() != null){
                    caseResult = value.getrbtn_inpatient();
                }
                else if (value.getrbtn_emergency() != null){
                    caseResult = value.getrbtn_emergency();
                }
                else if (value.getrbtn_society() != null){
                    caseResult = value.getrbtn_society();
                }

                case1.setText(caseResult);
                Log.d("aa", "Value is: " + value.getrbtn_outpatient());
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("aa", "Failed to read value.", error.toException());
            }
        });

    }
}
