package com.easytoquit.easytoquit_casemanager.Meeting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.easytoquit.easytoquit_casemanager.MainActivity;
import com.easytoquit.easytoquit_casemanager.R;
import com.easytoquit.easytoquit_casemanager.RetreiveData.GlobalVariable;
import com.easytoquit.easytoquit_casemanager.RetreiveData.MeetingAllUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MeetingAll extends AppCompatActivity {

    EditText edt_name;
    String sedt_name="";
    EditText edt_id;
    String sedt_id="";
    EditText edt_birthday;
    String sedt_birthday="";
    EditText edt_age;
    String sedt_age="";

    RadioGroup resource;
    RadioButton rbtn_outpatient;//門診
    String srbtn_outpatient="";
    RadioButton rbtn_inpatient;//住院
    String srbtn_inpatient="";
    RadioButton rbtn_emergency;//急診
    String srbtn_emergency="";
    RadioButton rbtn_society;//社區藥局
    String srbtn_society="";

    RadioGroup gender;
    RadioButton rbtn_male;//男生
    String srbtn_gecder="";
    RadioButton rbtn_female;//女生
    String srbtn_female="";

    RadioGroup marry;
    RadioButton rbtn_single;//未婚
    RadioButton rbtn_marriage;//已婚
    String srbtn_marrige="";
    RadioButton rbtn_marriage_others;//其他


    /*RadioGroup pregnant;
    RadioButton rbtn_pregnant_yes;//是
    String srbtn_pregnant_yes="";
    RadioButton rbtn_pregnant_no;//否
    String srbtn_pregnant_no="";

    EditText edt_address;
    String sedt_address="";

    RadioGroup education;
    RadioButton rbtn_elementary;//小學
    String srbtn_elementary="";
    RadioButton rbtn_junior;//國中
    String srbtn_junior="";
    RadioButton rbtn_senior;//高中
    String srbtn_senior="";
    RadioButton rbtn_college;//專科
    String srbtn_college="";
    RadioButton rbtn_university;//大學
    String srbtn_university="";
    RadioButton rbtn_graduate;//研究所(含)以上
    String srbtn_graduate="";

    EditText edt_height;//身高
    String sedt_height="";
    EditText edt_weight;//體重
    String sedt_weight="";
    EditText edt_pressure;//血壓
    String sedt_pressure="";
    EditText edt_phone;//電話
    String sedt_phone="";
    EditText edt_cellphone;//手機
    String sedt_cellphone="";
    EditText edt_email;//email
    String sedt_email="";

    RadioGroup drink;
    RadioButton rbtn_drink_yes;//有喝酒
    String srbtn_drink_yes="";
    RadioButton rbtn_drink_no;//沒喝酒
    String srbtn_drink_no="";

    RadioGroup Arecanut;
    RadioButton rbtn_eat_yes;//有吃檳榔
    String srbtn_eat_yes="";
    RadioButton rbtn_eat_no;//
    String srbtn_eat_no="";

    EditText edt_smoking_year;//菸齡
    String sedt_smoking_year="";

    RadioGroup firsttime;
    RadioButton rbtn_one_1;//5分鐘以內（3分)
    String srbtn_one_1="";
    RadioButton rbtn_one_2;//5-30分鐘（2分)
    String srbtn_one_2="";
    RadioButton rbtn_one_3;//31-60分鐘以內
    String srbtn_one_3="";
    RadioButton rbtn_one_4;//60分鐘以上（0分
    String srbtn_one_4="";

    RadioGroup nosmoke;
    RadioButton rbtn_two_1;//是（1分）
    String srbtn_two_1="";
    RadioButton rbtn_two_2;//否（0分）
    String srbtn_two_2="";

    RadioGroup hardgiveup;
    RadioButton rbtn_three_1;//早上第一支菸（1分
    String srbtn_three_1="";
    RadioButton rbtn_three_2;//其他（0分）
    String srbtn_three_2="";

    RadioGroup howmany;
    RadioButton rbtn_four_1;//31支以上（3分
    String srbtn_four_1="";
    RadioButton rbtn_four_2;//21-30分（2分）
    String srbtn_four_2="";
    RadioButton rbtn_four_3;//11-20支以上（1分
    String srbtn_four_3="";
    RadioButton rbtn_four_4;//0支或更少（0分
    String srbtn_four_4="";

    RadioGroup wackup;
    RadioButton rbtn_five_1;//是（1分）
    String srbtn_five_1="";
    RadioButton rbtn_five_2;//否（0分）
    String srbtn_five_2="";

    RadioGroup sicksmoking;
    RadioButton rbtn_six_1;//是（1分）
    String srbtn_six_1="";
    RadioButton rbtn_six_2;//否（0分）
    String srbtn_six_2="";

    RadioGroup yearnosmoking;
    RadioButton rbtn_2_one_1;//沒有
    String srbtn_2_one_1="";
    RadioButton rbtn_2_one_2;//有
    String srbtn_2_one_2="";

    RadioGroup cause;
    RadioButton rbtn_for_health;//為了健康
    String srbtn_for_health="";
    RadioButton rbtn_for_finance;//為了經濟
    String srbtn_for_finance="";
    RadioButton rbtn_for_family;//為了家庭
    String srbtn_for_family="";
    RadioButton rbtn_for_others;//其他
    String srbtn_for_others="";

    RadioGroup way;
    RadioButton rbtn_3_three_1;//門診戒菸
    String srbtn_3_three_1="";
    RadioButton rbtn_3_three_2;//戒菸班
    String srbtn_3_three_2="";
    RadioButton rbtn_3_three_3;//戒菸專線
    String srbtn_3_three_3="";
    RadioButton rbtn_3_three_4;//戒菸競賽
    String srbtn_3_three_4="";
    RadioButton rbtn_3_three_5;//靠自己意志力
    String srbtn_3_three_5="";
    RadioButton rbtn_3_three_6;//其他
    String srbtn_3_three_6="";

    RadioGroup nosmokingtime;
    RadioButton rbtn_3_four_1;//未滿1個月
    String srbtn_3_four_1="";
    RadioButton rbtn_3_four_2;//1個月以上未滿3個月
    String srbtn_3_four_2="";
    RadioButton rbtn_3_four_3;//3個月以上未滿6個月
    String srbtn_3_four_3="";
    RadioButton rbtn_3_four_4;//6 個月以上未滿1年
    String srbtn_3_four_4="";
    RadioButton rbtn_3_four_5;//1年以上
    String srbtn_3_four_5="";
    RadioButton rbtn_3_four_6;//其他
    String srbtn_3_four_6="";

    RadioGroup difficult;
    RadioButton rbtn_3_five_1;//戒斷症狀
    String srbtn_3_five_1="";
    RadioButton rbtn_3_five_2;//害怕失敗
    String srbtn_3_five_2="";
    RadioButton rbtn_3_five_3;//體重增加
    String srbtn_3_five_3="";
    RadioButton rbtn_3_five_4;//缺乏支持
    String srbtn_3_five_4="";
    RadioButton rbtn_3_five_5;//情緒低落、憂鬱
    String srbtn_3_five_5="";
    RadioButton rbtn_3_five_6;//很享受吸菸的感覺
    String srbtn_3_five_6="";
    RadioButton rbtn_3_five_7;//周圍有吸菸者
    String srbtn_3_five_7="";
    RadioButton rbtn_3_five_8;//不清楚有哪些戒菸服務可以選擇
    String srbtn_3_five_8="";
    RadioButton rbtn_3_five_9;//其他
    String srbtn_3_five_9="";
    EditText diveser;//併發疾病
    String sdiveser="";
    EditText medicine;//藥物
    String smedicine="";*/
    Button sure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_all);
        edt_name=(EditText)findViewById(R.id.edt_name);
        edt_id=(EditText)findViewById(R.id.edt_id);
        edt_birthday=(EditText)findViewById(R.id.edt_birthday);
        edt_age=(EditText)findViewById(R.id.edt_age);

        resource=(RadioGroup)findViewById(R.id.resource);
        rbtn_outpatient=(RadioButton)findViewById(R.id.rbtn_outpatient);
        rbtn_inpatient=(RadioButton)findViewById(R.id.rbtn_inpatient);
        rbtn_emergency=(RadioButton)findViewById(R.id.rbtn_emergency);
        rbtn_society=(RadioButton)findViewById(R.id.rbtn_society);


        gender=(RadioGroup)findViewById(R.id.gender);
        rbtn_male=(RadioButton)findViewById(R.id.rbtn_male);
        rbtn_female=(RadioButton)findViewById(R.id.rbtn_female);

        marry=(RadioGroup)findViewById(R.id.marry);
        rbtn_single=(RadioButton)findViewById(R.id.rbtn_single);
        rbtn_marriage=(RadioButton)findViewById(R.id.rbtn_marriage);
        rbtn_marriage_others=(RadioButton)findViewById(R.id.rbtn_marriage_others);

        /*pregnant=(RadioGroup)findViewById(R.id.pregnant);
        rbtn_pregnant_yes=(RadioButton)findViewById(R.id.rbtn_pregnant_yes);
        rbtn_pregnant_no=(RadioButton)findViewById(R.id.rbtn_pregnant_no);


        edt_address=(EditText)findViewById(R.id.edt_address) ;

        education=(RadioGroup)findViewById(R.id.education);
        rbtn_elementary=(RadioButton)findViewById(R.id.rbtn_elementary);
        rbtn_junior=(RadioButton)findViewById(R.id.rbtn_junior);
        rbtn_senior=(RadioButton)findViewById(R.id.rbtn_senior);
        rbtn_college=(RadioButton)findViewById(R.id.rbtn_college);
        rbtn_university=(RadioButton)findViewById(R.id.rbtn_university);
        rbtn_graduate=(RadioButton)findViewById(R.id.rbtn_graduate);


        edt_height=(EditText)findViewById(R.id.edt_height) ;
        edt_weight=(EditText)findViewById(R.id.edt_weight) ;
        edt_pressure=(EditText)findViewById(R.id.edt_pressure) ;
        edt_phone=(EditText)findViewById(R.id.edt_phone) ;
        edt_cellphone=(EditText)findViewById(R.id.edt_cellphone) ;
        edt_email=(EditText)findViewById(R.id.edt_email) ;

        drink=(RadioGroup)findViewById(R.id.drink);
        rbtn_drink_yes=(RadioButton)findViewById(R.id.rbtn_drink_yes);
        rbtn_drink_no=(RadioButton)findViewById(R.id.rbtn_drink_no);

        Arecanut=(RadioGroup)findViewById(R.id.Arecanut);
        rbtn_eat_yes=(RadioButton)findViewById(R.id.rbtn_eat_yes);
        rbtn_eat_no=(RadioButton)findViewById(R.id.rbtn_eat_no);

        firsttime=(RadioGroup)findViewById(R.id.firsttime);
        rbtn_one_1=(RadioButton)findViewById(R.id.rbtn_one_1);
        rbtn_one_2=(RadioButton)findViewById(R.id.rbtn_one_2);
        rbtn_one_3=(RadioButton)findViewById(R.id.rbtn_one_3);
        rbtn_one_4=(RadioButton)findViewById(R.id.rbtn_one_4);

        nosmoke=(RadioGroup)findViewById(R.id.nosmoke);
        rbtn_two_1=(RadioButton)findViewById(R.id.rbtn_two_1);
        rbtn_two_2=(RadioButton)findViewById(R.id.rbtn_two_2);

        hardgiveup=(RadioGroup)findViewById(R.id.hardgiveup);
        rbtn_three_1=(RadioButton)findViewById(R.id.rbtn_three_1);
        rbtn_three_2=(RadioButton)findViewById(R.id.rbtn_three_2);

        howmany=(RadioGroup)findViewById(R.id.howmany);
        rbtn_four_1=(RadioButton)findViewById(R.id.rbtn_four_1);
        rbtn_four_2=(RadioButton)findViewById(R.id.rbtn_four_2);
        rbtn_four_3=(RadioButton)findViewById(R.id.rbtn_four_3);
        rbtn_four_4=(RadioButton)findViewById(R.id.rbtn_four_4);

        wackup=(RadioGroup)findViewById(R.id.wackup);
        rbtn_five_1=(RadioButton)findViewById(R.id.rbtn_five_1);
        rbtn_five_2=(RadioButton)findViewById(R.id.rbtn_five_2);

        sicksmoking=(RadioGroup)findViewById(R.id.sicksmoking) ;
        rbtn_six_1=(RadioButton)findViewById(R.id.rbtn_six_1);
        rbtn_six_2=(RadioButton)findViewById(R.id.rbtn_six_2);

        yearnosmoking=(RadioGroup)findViewById(R.id.yearnosmoking);
        rbtn_2_one_1=(RadioButton)findViewById(R.id.rbtn_2_one_1);
        rbtn_2_one_2=(RadioButton)findViewById(R.id.rbtn_2_one_2);

        cause=(RadioGroup)findViewById(R.id.cause);
        rbtn_for_health=(RadioButton)findViewById(R.id.rbtn_for_health);
        rbtn_for_finance=(RadioButton)findViewById(R.id.rbtn_for_finance);
        rbtn_for_family=(RadioButton)findViewById(R.id.rbtn_for_family);
        rbtn_for_others=(RadioButton)findViewById(R.id.rbtn_for_others);

        way=(RadioGroup)findViewById(R.id.way);
        rbtn_3_three_1=(RadioButton)findViewById(R.id.rbtn_3_three_1);
        rbtn_3_three_2=(RadioButton)findViewById(R.id.rbtn_3_three_2);
        rbtn_3_three_3=(RadioButton)findViewById(R.id.rbtn_3_three_3);
        rbtn_3_three_4=(RadioButton)findViewById(R.id.rbtn_3_three_4);
        rbtn_3_three_5=(RadioButton)findViewById(R.id.rbtn_3_three_5);
        rbtn_3_three_6=(RadioButton)findViewById(R.id.rbtn_3_three_6);

        nosmokingtime=(RadioGroup)findViewById(R.id.nosmokingtime);
        rbtn_3_four_1=(RadioButton)findViewById(R.id.rbtn_3_four_1);
        rbtn_3_four_2=(RadioButton)findViewById(R.id.rbtn_3_four_2);
        rbtn_3_four_3=(RadioButton)findViewById(R.id.rbtn_3_four_3);
        rbtn_3_four_4=(RadioButton)findViewById(R.id.rbtn_3_four_4);
        rbtn_3_four_5=(RadioButton)findViewById(R.id.rbtn_3_four_5);
        rbtn_3_four_6=(RadioButton)findViewById(R.id.rbtn_3_four_6);

        difficult=(RadioGroup)findViewById(R.id.difficult);
        rbtn_3_five_1=(RadioButton)findViewById(R.id.rbtn_3_five_1);
        rbtn_3_five_2=(RadioButton)findViewById(R.id.rbtn_3_five_2);
        rbtn_3_five_3=(RadioButton)findViewById(R.id.rbtn_3_five_3);
        rbtn_3_five_4=(RadioButton)findViewById(R.id.rbtn_3_five_4);
        rbtn_3_five_5=(RadioButton)findViewById(R.id.rbtn_3_five_5);
        rbtn_3_five_6=(RadioButton)findViewById(R.id.rbtn_3_five_6);
        rbtn_3_five_7=(RadioButton)findViewById(R.id.rbtn_3_five_7);
        rbtn_3_five_8=(RadioButton)findViewById(R.id.rbtn_3_five_8);
        rbtn_3_five_9=(RadioButton)findViewById(R.id.rbtn_3_five_9);
        diveser=(EditText)findViewById(R.id.diveser) ;
        medicine=(EditText)findViewById(R.id.medicine) ;*/
        sure=(Button)findViewById(R.id.sure) ;
        /*edt_smoking_year=(EditText)findViewById(R.id.edt_smoking_year) ;*/
        sure.setOnClickListener(onclick);
        setTitle("總表");
    }
    private View.OnClickListener onclick = new View.OnClickListener() {

        public void onClick(View v) {
            FirebaseDatabase database = FirebaseDatabase.getInstance("https://wedproject-d750d.firebaseio.com/");
            DatabaseReference myRef = database.getReference();
            FileInputStream fis = null;
            StringBuilder sb = new StringBuilder();
            try{
                fis = MeetingAll.this.openFileInput("note.txt");
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
            String sb1 = sb.toString();
            switch(resource.getCheckedRadioButtonId()){
                case R.id.rbtn_outpatient:
                    srbtn_outpatient=rbtn_outpatient.getText().toString();
                    break;
                case R.id.rbtn_inpatient:
                    srbtn_outpatient=rbtn_inpatient.getText().toString(); //顯示結果
                    break;
                case R.id.rbtn_emergency:
                    srbtn_outpatient=rbtn_emergency.getText().toString(); //顯示結果
                    break;
                case R.id.rbtn_society:
                    srbtn_outpatient=rbtn_society.getText().toString(); //顯示結果
                    break;
            }

            switch(gender.getCheckedRadioButtonId()){
                case R.id.rbtn_male:
                    srbtn_gecder=rbtn_male.getText().toString();
                    break;
                case R.id.rbtn_female:
                    srbtn_gecder=rbtn_female.getText().toString(); //顯示結果
                    break;
            }

            switch(marry.getCheckedRadioButtonId()){
                case R.id.rbtn_marriage:
                    srbtn_gecder=rbtn_male.getText().toString();
                    break;
                case R.id.rbtn_single:
                    srbtn_gecder=rbtn_female.getText().toString(); //顯示結果
                    break;
                case R.id.rbtn_marriage_others:
                    srbtn_gecder=rbtn_female.getText().toString(); //顯示結果
                    break;
            }

            sedt_name =edt_name.getText().toString();
            sedt_id=edt_id.getText().toString();
            sedt_birthday=edt_birthday.getText().toString();
            sedt_age=edt_age.getText().toString();


            //加入防呆功能 所有edittext不可為空
            MeetingAllUser meetingAlluser = new MeetingAllUser(
                    sedt_name, sedt_id, sedt_birthday, sedt_age, srbtn_outpatient,srbtn_gecder,srbtn_marrige/*, srbtn_inpatient,
                    srbtn_emergency, srbtn_society, srbtn_male, srbtn_female, srbtn_single, srbtn_marriage,
                    srbtn_marriage_others, srbtn_pregnant_yes, srbtn_pregnant_no, sedt_address,
                    srbtn_elementary, srbtn_junior, srbtn_senior, srbtn_college, srbtn_university,
                    srbtn_graduate, sedt_height, sedt_weight, sedt_pressure, sedt_phone, sedt_cellphone,
                    sedt_email, srbtn_drink_yes, srbtn_drink_no, srbtn_eat_yes, srbtn_eat_no, sedt_smoking_year,
                    srbtn_one_1, srbtn_one_2, srbtn_one_3, srbtn_one_4, srbtn_two_1, srbtn_two_2, srbtn_three_1,
                    srbtn_three_2, srbtn_four_1, srbtn_four_2, srbtn_four_3, srbtn_four_4, srbtn_five_1,
                    srbtn_five_2, srbtn_six_1, srbtn_six_2, srbtn_2_one_1, srbtn_2_one_2, srbtn_for_health, srbtn_for_finance,
                    srbtn_for_family, srbtn_for_others, srbtn_3_three_1, srbtn_3_three_2, srbtn_3_three_3, srbtn_3_three_4, srbtn_3_three_5, srbtn_3_three_6,
                    srbtn_3_four_1, srbtn_3_four_2, srbtn_3_four_3, srbtn_3_four_4, srbtn_3_four_5, srbtn_3_four_6, srbtn_3_five_1,
                    srbtn_3_five_2, srbtn_3_five_3, srbtn_3_five_4, srbtn_3_five_5, srbtn_3_five_6, srbtn_3_five_7, srbtn_3_five_8, srbtn_3_five_9,
                    sdiveser, smedicine*/);

            /*, srbtn_inpatient,
                    srbtn_emergency, srbtn_society, srbtn_male, srbtn_female, srbtn_single, srbtn_marriage,
                    srbtn_marriage_others, srbtn_pregnant_yes, srbtn_pregnant_no, sedt_address,
                    srbtn_elementary, srbtn_junior, srbtn_senior, srbtn_college, srbtn_university,
                    srbtn_graduate, sedt_height, sedt_weight, sedt_pressure, sedt_phone, sedt_cellphone,
                    sedt_email, srbtn_drink_yes, srbtn_drink_no, srbtn_eat_yes, srbtn_eat_no, sedt_smoking_year,
                    srbtn_one_1, srbtn_one_2, srbtn_one_3, srbtn_one_4, srbtn_two_1, srbtn_two_2, srbtn_three_1,
                    srbtn_three_2, srbtn_four_1, srbtn_four_2, srbtn_four_3, srbtn_four_4, srbtn_five_1,
                    srbtn_five_2, srbtn_six_1, srbtn_six_2, srbtn_2_one_1, srbtn_2_one_2, srbtn_for_health, srbtn_for_finance,
                    srbtn_for_family, srbtn_for_others, srbtn_3_three_1, srbtn_3_three_2, srbtn_3_three_3, srbtn_3_three_4, srbtn_3_three_5, srbtn_3_three_6,
                    srbtn_3_four_1, srbtn_3_four_2, srbtn_3_four_3, srbtn_3_four_4, srbtn_3_four_5, srbtn_3_four_6, srbtn_3_five_1,
                    srbtn_3_five_2, srbtn_3_five_3, srbtn_3_five_4, srbtn_3_five_5, srbtn_3_five_6, srbtn_3_five_7, srbtn_3_five_8, srbtn_3_five_9,
                    sdiveser, smedicine*/

            GlobalVariable gv = (GlobalVariable)getApplicationContext();
            String userPhone = gv.getPhone();

            myRef.child("users").child(userPhone).child("訪談紀錄").child("總表").setValue(meetingAlluser);




            Intent intent = new Intent(MeetingAll.this, MainActivity.class);
            intent.putExtra("meet",5);
            startActivity(intent);
        }

    };
}
