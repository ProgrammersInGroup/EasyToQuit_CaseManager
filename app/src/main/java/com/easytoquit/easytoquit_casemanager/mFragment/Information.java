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
import android.widget.Toast;

import com.easytoquit.easytoquit_casemanager.Information_Pdf.Information_Pdf1;
import com.easytoquit.easytoquit_casemanager.Information_Pdf.Information_Pdf2;
import com.easytoquit.easytoquit_casemanager.Information_Pdf.Information_Pdf3;
import com.easytoquit.easytoquit_casemanager.Information_Pdf.Information_Pdf4;
import com.easytoquit.easytoquit_casemanager.R;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class Information extends Fragment {
    private ListView lv;
    private static String[] information_category = {"吸菸對健康的危害", "戒斷症狀", "電子菸對健康的危害", "二手菸、三手菸的危害"};

    public static Information newInstance(){

        Information information = new Information();
        return information;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information, container, false);

        lv = (ListView) view.findViewById(R.id.listView_information);
        lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, information_category));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                Intent intent;
                if(i == 0){
                    intent = new Intent();
                    intent.setClass(getActivity(), Information_Pdf1.class);
                    startActivity(intent);
                    //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                }else if(i == 1){
                    intent  = new Intent();
                    intent.setClass(getActivity(), Information_Pdf2.class);
                    startActivity(intent);
                    //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                }
                else if(i == 2){
                    intent  = new Intent();
                    intent.setClass(getActivity(), Information_Pdf3.class);
                    startActivity(intent);
                    //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                }
                else if(i == 3){
                    intent  = new Intent();
                    intent.setClass(getActivity(), Information_Pdf4.class);
                    startActivity(intent);
                    //Toast.makeText(getActivity(), information_category[i], Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "Cannot Show Pdf", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("衛教資訊");
    }
}
