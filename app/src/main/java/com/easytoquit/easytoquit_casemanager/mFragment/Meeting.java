package com.easytoquit.easytoquit_casemanager.mFragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.easytoquit.easytoquit_casemanager.Meeting.MeetingAll;
import com.easytoquit.easytoquit_casemanager.Meeting.MeetingFirst;
import com.easytoquit.easytoquit_casemanager.Meeting.MeetingSecond;
import com.easytoquit.easytoquit_casemanager.R;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class Meeting extends Fragment {
    private ListView lv;
    private static String[] meeting_category = {"總表", "戒菸衛教暨個案管理紀錄表(第 1 次)", "戒菸衛教暨個案管理紀錄表(第 2 ～ 8 次)"};

    public static Meeting newInstance(){

        Meeting meeting = new Meeting();
        return meeting;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.meeting, container, false);

        lv = (ListView) view.findViewById(R.id.listView_meeting);
        lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, meeting_category));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();;
                if (i == 0) {
                    intent.setClass(getActivity(), MeetingAll.class);
                } else if (i == 1) {
                    intent.setClass(getActivity(), MeetingFirst.class);
                } else {
                    intent.setClass(getActivity(), MeetingSecond.class);
                }
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("訪談紀錄");
    }
}
