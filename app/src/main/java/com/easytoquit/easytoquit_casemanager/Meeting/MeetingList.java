package com.easytoquit.easytoquit_casemanager.Meeting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.easytoquit.easytoquit_casemanager.R;

public class MeetingList extends AppCompatActivity {

    private ListView lv;
    private static String[] meeting_category = {"總表", "戒菸衛教暨個案管理紀錄表(第 1 次)", "戒菸衛教暨個案管理紀錄表(第 2 ～ 8 次)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_list);

        setTitle("訪談紀錄");

        lv = (ListView) findViewById(R.id.listView_meeting);
        lv.setAdapter(new ArrayAdapter<String>(MeetingList.this, android.R.layout.simple_list_item_1, meeting_category));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent();;
                if (i == 0) {
                    //intent.setClass( MeetingList.this, MeetingAll.class);
                    Uri myBlogUri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfFMor5O2VBph17IIESnymhy1SQspvXwulOWD_UvDqq0-fhhw/viewform");
                    Intent returnIt = new Intent(Intent.ACTION_VIEW, myBlogUri);
                    startActivity(returnIt);
                } else if (i == 1) {
                    //intent.setClass(MeetingList.this, MeetingFirst.class);
                    Uri myBlogUri = Uri.parse("https://goo.gl/forms/DE4cYxGHmj67VpJO2");
                    Intent returnIt = new Intent(Intent.ACTION_VIEW, myBlogUri);
                    startActivity(returnIt);
                } else {
                    //intent.setClass(MeetingList.this, MeetingSecond.class);
                    Uri myBlogUri = Uri.parse("https://goo.gl/forms/hYF2U31nj1U3LtcI2");
                    Intent returnIt = new Intent(Intent.ACTION_VIEW, myBlogUri);
                    startActivity(returnIt);
                }
                //startActivity(intent);
            }
        });
    }
}
