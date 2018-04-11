package com.easytoquit.easytoquit_casemanager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.easytoquit.easytoquit_casemanager.Insertion.InsertProfile;
import com.easytoquit.easytoquit_casemanager.RetreiveData.User;
import com.easytoquit.easytoquit_casemanager.mFragment.Health_Stop;
import com.easytoquit.easytoquit_casemanager.mFragment.Information;
import com.easytoquit.easytoquit_casemanager.mFragment.Profile;
import com.easytoquit.easytoquit_casemanager.mFragment.Status;
import com.easytoquit.easytoquit_casemanager.mFragment.Tips;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Long startTime;
    private Handler handler = new Handler();
    private static final String data = "DATA";
    private static final String TAG = "MainActivity";
    int number;
    TextView nav_header_name;
    CircleImageView profile_image;
    String BitmapString;
    Bitmap mBitmapImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FragmentManager fragmentManager = getFragmentManager();


        final Intent intent = getIntent();
        SharedPreferences settings;
        settings = getSharedPreferences(data,0);
        number = settings.getInt(data,0);
        if (number==0) {
            number = intent.getIntExtra("id", 0);
        }
       /* number = settings.getInt(numberField,0);*/
        Log.e(TAG, "number: "+number);
        if(number==0) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("聲明")
                    .setMessage("當你使用本應用程式做戒菸指導時，系統會收集及記錄你所提供的吸菸習慣及個人" +
                            "資料，包括你的性別和年齡。同時，系統會記錄手機" +
                            "獨特識別碼。這些資料只用於給予你合適的戒菸指導並" +
                            "做為統計作用，而手機獨特識別碼會在戒菸跟近期（約一年）完成後，在伺服器內" +
                            "被刪除。本應用程式不會收集任何可視辨使用身份的資料" +
                            "本應用程式所收集的資料會被保密，只有獲得授權的人是才可查閱")
                    .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "我已經了解了！", Toast.LENGTH_SHORT).show();
                            intent.setClass(MainActivity.this, InsertProfile.class);
                            startActivity(intent);
                        }
                    })
                    .show();
            // new AlertDialog.Builder(this).setMessage("這是第一次打開").show();
        } else {

            settings.edit().putInt(data,1).commit();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new Health_Stop())
                    .commit();
            // new AlertDialog.Builder(this).setMessage("這是打開很多次了").show();

            //讀出檔案
            FileInputStream fis = null;
            StringBuilder sb = new StringBuilder();
            try{
                fis = openFileInput("note.txt");
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String str = "";
                while ((str = br.readLine())!=null){
                    sb.append(str);
                }
                br.close();
                isr.close();
                fis.close();
            }catch (Exception e){
                Log.e("Internal",  e.toString() );
            }

            FirebaseDatabase database = FirebaseDatabase.getInstance("https://wedproject-d750d.firebaseio.com/");
            //改為用暫存檔讀取資料庫
            DatabaseReference myRef = database.getReference("CaseManager/" + sb);
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // Get Post object and use the values to update the UI
                /*User user = dataSnapshot.getValue(User.class);
                // [START_EXCLUDE]
                Log.d(TAG, "Value is: " + user);*/
                    User value = dataSnapshot.getValue(User.class);
                    Log.d(TAG, "Value is: " + value.getName());
                    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
                    navigationView.setNavigationItemSelectedListener(MainActivity.this);
                    View headerView = navigationView.getHeaderView(0);
                    nav_header_name = (TextView) headerView.findViewById(R.id.nav_header_name);
                    profile_image = (CircleImageView)headerView.findViewById(R.id.profile_image);
                    nav_header_name.setText(value.getName());
                    BitmapString = value.getBitmapString();
                    mBitmapImage=getBitmap(BitmapString);
                    //lets put the image in the image view
                    //Bitmap d = new BitmapDrawable(this.getResources() , selectedImage).getBitmap();
                    int nh = (int) ( mBitmapImage.getHeight() * (512.0 / mBitmapImage.getWidth()) );
                    Bitmap scaled = Bitmap.createScaledBitmap(mBitmapImage, 512, nh, true);
                    profile_image.setImageBitmap(scaled);

                }

                public Bitmap getBitmap(String x){

                    byte[] bitmapArray;
                    bitmapArray = Base64.decode(x,Base64.DEFAULT);
                    Bitmap bmp = BitmapFactory.decodeByteArray(bitmapArray
                            , 0 , bitmapArray.length);
                    return bmp;


                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // Getting Post failed, log a message
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                    // [START_EXCLUDE]
               /* Toast.makeText(Profile.this, "Failed to load post.",
                        Toast.LENGTH_SHORT).show();*/
                    // [END_EXCLUDE]
                }
            });

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();






        //取得目前時間
        startTime = System.currentTimeMillis();
        //設定定時要執行的方法
        handler.removeCallbacks(updateTimer);
        //設定Delay的時間
        handler.postDelayed(updateTimer, 1000);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private void displaySelectedScreen(int id){
        //判斷不同側選單進入頁面
        Fragment fragment = null;

        FragmentManager fragmentManager = getFragmentManager();

        switch (id){
            /*case R.id.nav_status:
                *//*Intent intent = new Intent();
                intent.setClass(this, Splash.class);
                startActivity(intent);*//*
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Status())
                        .commit();

                // 通知
                //Notification.showFullScreen(this);
                break;*/
            case R.id.nav_profile:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Profile())
                        .commit();
                break;
            /*case R.id.nav_assessment:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Assessment())
                        .commit();
                break;*/
            case R.id.nav_health_stop:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Health_Stop())
                        .commit();
                break;
            case R.id.nav_information:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Information())
                        .commit();
                break;
            case R.id.nav_tips:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Tips())
                        .commit();
                break;
            /*case R.id.nav_history:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new History())
                        .commit();
                break;*/
            /*case R.id.nav_others:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Others())
                        .commit();
                break;*/
            /*case R.id.nav_meeting:
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new Meeting())
                        .commit();
                break;*/
        }

        if (fragment != null) {

            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new Status())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //選單選項
        displaySelectedScreen(id);

        return true;
    }
    private Runnable updateTimer = new Runnable() {
        public void run() {
            //final TextView time = (TextView) findViewById(R.id.timer);
            Long spentTime = System.currentTimeMillis() - startTime;
            //計算目前已過月份數
            Long month = (spentTime/1000/3600/24/12)+1;
            if(month % 2 == 0) {
                Log.d("aa", "month = " + month);
            }
            //計算目前已過秒數
            Long seconds = (spentTime/1000) % 60;
            //time.setText(minius+":"+seconds);
            if(seconds%60 == 0){
                //Notification.showFullScreen(MainActivity.this);
                //Log.d("aa", "yaaaaa");
            }
            handler.postDelayed(this, 1000);
        }
    };
}
