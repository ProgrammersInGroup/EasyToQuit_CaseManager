package com.easytoquit.easytoquit_casemanager.mFragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.easytoquit.easytoquit_casemanager.QRCode_Scanner;
import com.easytoquit.easytoquit_casemanager.R;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class Health_Stop extends Fragment {
    private Button scan_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.health_stop, container, false);

        scan_btn = (Button) view.findViewById(R.id.scan_btn);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getActivity(), QRCode_Scanner.class);
                startActivity(intent);

            }
        });

        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("健康小站");
    }
}
