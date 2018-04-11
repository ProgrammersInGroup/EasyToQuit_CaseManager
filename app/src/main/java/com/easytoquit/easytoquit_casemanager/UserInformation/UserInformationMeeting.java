package com.easytoquit.easytoquit_casemanager.UserInformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.UserInformation.UserInformationMeetingList.UserInformationMeetingAll;
import com.easytoquit.easytoquit_casemanager.UserInformation.UserInformationMeetingList.UserInformationMeetingFirst;
import com.easytoquit.easytoquit_casemanager.UserInformation.UserInformationMeetingList.UserInformationMeetingSecond;

public class UserInformationMeeting extends AppCompatActivity {

    private ListView lv;
    private static String[] meeting_category = {"總表", "戒菸衛教暨個案管理紀錄表(第 1 次)", "戒菸衛教暨個案管理紀錄表(第 2 次)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information_meeting);
        setTitle("戒菸者訪談紀錄列表");

        lv = (ListView) findViewById(R.id.listView_user_information_meeting);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meeting_category));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();;
                if (i == 0) {
                    intent.setClass(UserInformationMeeting.this, UserInformationMeetingAll.class);


                } else if (i == 1) {
                    intent.setClass(UserInformationMeeting.this, UserInformationMeetingFirst.class);
                } else {
                    intent.setClass(UserInformationMeeting.this, UserInformationMeetingSecond.class);
                }
                startActivity(intent);
            }
        });
    }
}
