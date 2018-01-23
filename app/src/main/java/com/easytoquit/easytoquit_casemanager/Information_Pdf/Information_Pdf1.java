package com.easytoquit.easytoquit_casemanager.Information_Pdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.easytoquit.easytoquit_casemanager.R;

public class Information_Pdf1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information__pdf1);

        WebView webview = (WebView) findViewById(R.id.i_pdf1_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "https://drive.google.com/file/d/1NzAbjlhTxBMps9FMajTf35FsTprv4cDD/view";
        //https://drive.google.com/file/d/1NzAbjlhTxBMps9FMajTf35FsTprv4cDD/view
        webview.loadUrl(pdf);
        setTitle("吸菸對健康的危害");
    }
}
