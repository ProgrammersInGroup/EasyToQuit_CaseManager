package com.easytoquit.easytoquit_casemanager.RetreiveData;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class User {
    private String name ;
    private String age ;
    private String gender;
    private String phone;
    private String BitmapString;

    //private Bitmap profile_image;

    public User() {
    }

    public User( String name, String age,String gender,String phone,String BitmapString) {
        //this.profile_image = profile_image;
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.phone=phone;
        this.BitmapString=BitmapString;
    }

    /*public Bitmap getProfile_image(){ return profile_image; }
    public void setProfile_image(Bitmap profile_image){ this.profile_image = profile_image; }*/
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBitmapString() {
        return BitmapString;
    }
    public void setBitmapString(String BitmapString) {
        this.BitmapString = BitmapString;
    }
}
