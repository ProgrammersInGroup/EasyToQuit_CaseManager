package com.easytoquit.easytoquit_casemanager.RetreiveData;

import android.app.Application;
import android.graphics.Bitmap;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class GlobalVariable extends Application {
    private String Phone;
    private Bitmap profile_image;

    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    public void setProfileImage(Bitmap profile_image){
        this.profile_image = profile_image;
    }

    //取得 變數值
    public String getPhone() {
        return Phone;
    }
    public Bitmap getProfile_image() { return profile_image; }

}
