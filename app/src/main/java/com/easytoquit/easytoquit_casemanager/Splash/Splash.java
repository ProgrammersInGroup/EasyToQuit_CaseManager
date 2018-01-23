package com.easytoquit.easytoquit_casemanager.Splash;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.easytoquit.easytoquit_casemanager.MainActivity;
import com.easytoquit.easytoquit_casemanager.R;

public class Splash extends Activity {

    private TextView tv;
    private ImageView iv;

    Typeface tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉標題欄
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tv =(TextView)findViewById(R.id.icon);
        iv =(ImageView)findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);

//        set fonts->failed
//        Typeface tf = Typeface.createFromAsset(this.getAssets(),"fonts/cyz.ttf");
//        tv.setTypeface(tf);
    }
}
