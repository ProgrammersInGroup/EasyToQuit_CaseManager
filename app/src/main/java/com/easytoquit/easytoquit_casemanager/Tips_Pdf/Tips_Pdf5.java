package com.easytoquit.easytoquit_casemanager.Tips_Pdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.easytoquit.easytoquit_casemanager.R;

public class Tips_Pdf5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips__pdf5);

        WebView webview = (WebView) findViewById(R.id.t_pdf5_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "https://drive.google.com/file/d/1YJpKlKPwWW3MexadATrKHby8t2xhwcPP/view";
        //https://drive.google.com/file/d/1YJpKlKPwWW3MexadATrKHby8t2xhwcPP/view
        webview.loadUrl(pdf);
        setTitle("就醫資訊");
    }
}
