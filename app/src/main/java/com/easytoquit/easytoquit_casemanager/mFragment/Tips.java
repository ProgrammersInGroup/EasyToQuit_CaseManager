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

import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.Tips_Pdf.Tips_Pdf1;
import com.easytoquit.easytoquit_casemanager.Tips_Pdf.Tips_Pdf2;
import com.easytoquit.easytoquit_casemanager.Tips_Pdf.Tips_Pdf3;
import com.easytoquit.easytoquit_casemanager.Tips_Pdf.Tips_Pdf4;
import com.easytoquit.easytoquit_casemanager.Tips_Pdf.Tips_Pdf5;


/**
 * Created by Polaris0712 on 11/01/2018.
 */

public class Tips extends Fragment {

    private ListView lv;
    private static String[] tips_category = {"戒菸好處", "戒菸方法介紹", "克服菸癮的方法", "戒菸資源", "就醫資訊"};

    public static Tips newInstance(){

        Tips tips = new Tips();
        return tips;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tips, container, false);

        lv = (ListView) view.findViewById(R.id.listView_tips);
        lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, tips_category));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), tips_category[i], Toast.LENGTH_SHORT).show();
                Intent intent;
                if(i == 0){
                    intent  = new Intent();
                    intent.setClass(getActivity(),Tips_Pdf1.class);
                    startActivity(intent);
                }
                else if(i == 1){
                    intent  = new Intent();
                    intent.setClass(getActivity(),Tips_Pdf2.class);
                    startActivity(intent);
                }
                else if(i == 2){
                    intent  = new Intent();
                    intent.setClass(getActivity(),Tips_Pdf3.class);
                    startActivity(intent);
                }
                else if(i == 3){
                    intent  = new Intent();
                    intent.setClass(getActivity(),Tips_Pdf4.class);
                    startActivity(intent);
                }else if(i == 4){
                    intent  = new Intent();
                    intent.setClass(getActivity(),Tips_Pdf5.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(getActivity(), "Cannot Show PDF", Toast.LENGTH_SHORT).show();
                }


            }
        });

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("戒菸撇步");
    }
}
