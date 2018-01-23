package com.easytoquit.easytoquit_casemanager.UserInformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.easytoquit.easytoquit_casemanager.Meeting.MeetingList;
import com.easytoquit.easytoquit_casemanager.R;

public class UserInformation extends AppCompatActivity {

    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        setTitle("戒菸者檔案");

        enter = (Button)findViewById(R.id.enter);
        ListView listview = (ListView) findViewById(R.id.listview_user_information);
        //ListView 要顯示的內容
        final String[] str = {"基本資料","評估資料","訪談紀錄"};
        //android.R.layout.simple_list_item_1 為內建樣式，還有其他樣式可自行研究
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                str);
        listview.setAdapter(adapter);
        listview.addFooterView(new View(UserInformation.this));
        enter.setOnClickListener(BtnListener);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    ListView listView = (ListView) parent;
                    Intent intent = new Intent(UserInformation.this, UserInformationProfile.class);

                    /*Bundle bundle = new Bundle();
                    bundle.putInt("page", position);
                    intent.putExtras(bundle);*/
                    startActivity(intent);
                    //FruitList.this.finish();
                }
                else if(position==1){
                    Intent intent = new Intent(UserInformation.this, UserInformationAssessment.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("page", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(UserInformation.this, UserInformationMeeting.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("page", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

    }

    private View.OnClickListener BtnListener = new View.OnClickListener() {

        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(UserInformation.this, MeetingList.class);
            startActivity(intent);
        }
    };
}
