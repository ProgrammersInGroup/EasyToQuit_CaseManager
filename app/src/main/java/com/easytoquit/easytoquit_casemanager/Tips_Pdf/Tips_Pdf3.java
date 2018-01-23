package com.easytoquit.easytoquit_casemanager.Tips_Pdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.easytoquit.easytoquit_casemanager.R;

public class Tips_Pdf3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips__pdf3);

        WebView webview = (WebView) findViewById(R.id.t_pdf3_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "https://drive.google.com/file/d/150XLScortzrmjNQFlxawe6fV9bkGBcRz/view";
        //https://drive.google.com/file/d/150XLScortzrmjNQFlxawe6fV9bkGBcRz/view
        webview.loadUrl(pdf);
        setTitle("克服菸癮的方法");
    }
}
