package com.easytoquit.easytoquit_casemanager.Information_Pdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.easytoquit.easytoquit_casemanager.R;

public class Information_Pdf3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information__pdf1);

        WebView webview = (WebView) findViewById(R.id.i_pdf3_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "https://drive.google.com/file/d/1ZchWHSDeyLqDhYgBAmw_aJAghqYTlPeG/view";
        //https://drive.google.com/file/d/1ZchWHSDeyLqDhYgBAmw_aJAghqYTlPeG/view
        webview.loadUrl(pdf);
        setTitle("電子菸對健康的危害");

    }
}
