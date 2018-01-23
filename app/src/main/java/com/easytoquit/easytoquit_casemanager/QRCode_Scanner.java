package com.easytoquit.easytoquit_casemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.easytoquit.easytoquit_casemanager.RetreiveData.GlobalVariable;
import com.easytoquit.easytoquit_casemanager.UserInformation.UserInformation;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QRCode_Scanner extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode__scanner);
        setTitle("掃描");
        final Activity activity = this;
        IntentIntegrator integrator = new IntentIntegrator(activity);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Scan");
        integrator.setCameraId(0);
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(false);
        integrator.initiateScan();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if(result.getContents() == null){
                //Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, UserInformation.class);
                GlobalVariable gv = (GlobalVariable)getApplicationContext();
                gv.setPhone(result.getContents());
                startActivity(intent);
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }

    }


}
