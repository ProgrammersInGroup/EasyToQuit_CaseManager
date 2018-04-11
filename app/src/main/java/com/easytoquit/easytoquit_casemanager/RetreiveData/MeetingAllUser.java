package com.easytoquit.easytoquit_casemanager.RetreiveData;

/**
 * Created by Polaris0712 on 14/01/2018.
 */

public class MeetingAllUser {

    private String
            name,
            edt_id,
            edt_birthday,
            edt_age,
            rbtn_outpatient,
            rbtn_gender,
            rbtn_marriage;
           /* rbtn_inpatient,
            rbtn_emergency,
            rbtn_society;
            rbtn_male,
            rbtn_female,
            rbtn_single,
            rbtn_marriage,
            rbtn_marriage_others,
            rbtn_pregnant_yes,
    rbtn_pregnant_no,
            edt_address,
            rbtn_elementary,
            rbtn_junior,
            rbtn_senior,
            rbtn_college,
            rbtn_university,
            rbtn_graduate,
            edt_height,
            edt_weight,
            edt_pressure,
            edt_phone,
            edt_cellphone,
            edt_email,
            rbtn_drink_yes,
            rbtn_drink_no,
            rbtn_eat_yes,
            rbtn_eat_no,
            edt_smoking_year,
            rbtn_one_1,
            rbtn_one_2,
            rbtn_one_3,
            rbtn_one_4,
            rbtn_two_1,
            rbtn_two_2,
            rbtn_three_1,
            rbtn_three_2,
            rbtn_four_1,
            rbtn_four_2,
            rbtn_four_3,
            rbtn_four_4,
            rbtn_five_1,
            rbtn_five_2,
            rbtn_six_1,
            rbtn_six_2,
            rbtn_2_one_1,
            rbtn_2_one_2,
            rbtn_for_health,
            rbtn_for_finance,
            rbtn_for_family,
            rbtn_for_others,
            rbtn_3_three_1,
            rbtn_3_three_2,
            rbtn_3_three_3,
            rbtn_3_three_4,
            rbtn_3_three_5,
            rbtn_3_three_6,
            rbtn_3_four_1,
            rbtn_3_four_2,
            rbtn_3_four_3,
            rbtn_3_four_4,
            rbtn_3_four_5,
            rbtn_3_four_6,
            rbtn_3_five_1,
            rbtn_3_five_2,
            rbtn_3_five_3,
            rbtn_3_five_4,
            rbtn_3_five_5,
            rbtn_3_five_6,
            rbtn_3_five_7,
            rbtn_3_five_8,
            rbtn_3_five_9,
            diveser,
            medicine;*/

//9-86
    //457-380

    public MeetingAllUser(){

    }
    /*備份
    String name, String edt_id, String edt_birthday, String edt_age,
    String rbtn_outpatient, String rbtn_inpatient, String rbtn_emergency,
                          String rbtn_society, String rbtn_male, String rbtn_female, String rbtn_single,
                          String rbtn_marriage, String rbtn_marriage_others, String rbtn_pregnant_yes,
                          String rbtn_pregnant_no, String edt_address, String rbtn_elementary, String rbtn_junior
                          , String rbtn_senior, String rbtn_college, String rbtn_university, String rbtn_graduate,
                          String edt_height, String edt_weight, String edt_pressure, String edt_phone, String edt_cellphone,
                          String edt_email, String rbtn_drink_yes, String rbtn_drink_no, String rbtn_eat_yes,
                          String rbtn_eat_no, String edt_smoking_year, String rbtn_one_1, String rbtn_one_2,
                          String rbtn_one_3, String rbtn_one_4, String rbtn_two_1, String rbtn_two_2, String rbtn_three_1,
                          String rbtn_three_2, String rbtn_four_1, String rbtn_four_2, String rbtn_four_3, String rbtn_four_4,
                          String rbtn_five_1, String rbtn_five_2, String rbtn_six_1, String rbtn_six_2, String rbtn_2_one_1,
                          String rbtn_2_one_2, String rbtn_for_health, String rbtn_for_finance, String rbtn_for_family,
                          String rbtn_for_others, String rbtn_3_three_1, String rbtn_3_three_2, String rbtn_3_three_3,
                          String rbtn_3_three_4, String rbtn_3_three_5, String rbtn_3_three_6, String rbtn_3_four_1, String rbtn_3_four_2,
                          String rbtn_3_four_3, String rbtn_3_four_4, String rbtn_3_four_5, String rbtn_3_four_6,
                          String rbtn_3_five_1, String rbtn_3_five_2, String rbtn_3_five_3, String rbtn_3_five_4,
                          String rbtn_3_five_5, String rbtn_3_five_6, String rbtn_3_five_7, String rbtn_3_five_8,
                          String rbtn_3_five_9, String diveser, String medicine*/

    public MeetingAllUser(String name, String edt_id, String edt_birthday, String edt_age,
                          String rbtn_outpatient,String rbtn_gender,String rbtn_marriage/*, String rbtn_male, String rbtn_female, String rbtn_single,
                          String rbtn_marriage, String rbtn_marriage_others, String rbtn_pregnant_yes,
                          String rbtn_pregnant_no, String edt_address, String rbtn_elementary, String rbtn_junior
                          , String rbtn_senior, String rbtn_college, String rbtn_university, String rbtn_graduate,
                          String edt_height, String edt_weight, String edt_pressure, String edt_phone, String edt_cellphone,
                          String edt_email, String rbtn_drink_yes, String rbtn_drink_no, String rbtn_eat_yes,
                          String rbtn_eat_no, String edt_smoking_year, String rbtn_one_1, String rbtn_one_2,
                          String rbtn_one_3, String rbtn_one_4, String rbtn_two_1, String rbtn_two_2, String rbtn_three_1,
                          String rbtn_three_2, String rbtn_four_1, String rbtn_four_2, String rbtn_four_3, String rbtn_four_4,
                          String rbtn_five_1, String rbtn_five_2, String rbtn_six_1, String rbtn_six_2, String rbtn_2_one_1,
                          String rbtn_2_one_2, String rbtn_for_health, String rbtn_for_finance, String rbtn_for_family,
                          String rbtn_for_others, String rbtn_3_three_1, String rbtn_3_three_2, String rbtn_3_three_3,
                          String rbtn_3_three_4, String rbtn_3_three_5, String rbtn_3_three_6, String rbtn_3_four_1, String rbtn_3_four_2,
                          String rbtn_3_four_3, String rbtn_3_four_4, String rbtn_3_four_5, String rbtn_3_four_6,
                          String rbtn_3_five_1, String rbtn_3_five_2, String rbtn_3_five_3, String rbtn_3_five_4,
                          String rbtn_3_five_5, String rbtn_3_five_6, String rbtn_3_five_7, String rbtn_3_five_8,
                          String rbtn_3_five_9, String diveser, String medicine*/



    ) {
        this.name = name;
        this.edt_id = edt_id;
        this.edt_birthday=edt_birthday;
        this.edt_age=edt_age;
        this.rbtn_outpatient=rbtn_outpatient;
        this.rbtn_gender=rbtn_gender;
        this.rbtn_marriage=rbtn_marriage;
        /*this.rbtn_inpatient=rbtn_inpatient;
        this.rbtn_emergency=rbtn_emergency;
        this.rbtn_society=rbtn_society;
        this.rbtn_male=rbtn_male;
        this.rbtn_female=rbtn_female;
        this.rbtn_single=rbtn_single;
        this.rbtn_marriage=rbtn_marriage;
        this.rbtn_marriage_others=rbtn_marriage_others;
        this.rbtn_pregnant_yes=rbtn_pregnant_yes;
        this.rbtn_pregnant_no=rbtn_pregnant_no;
        this.edt_address=edt_address;
        this.rbtn_elementary=rbtn_elementary;
        this.rbtn_junior=rbtn_junior;
        this.rbtn_senior=rbtn_senior;
        this.rbtn_college=rbtn_college;
        this.rbtn_university=rbtn_university;
        this.rbtn_graduate=rbtn_graduate;
        this.edt_height=edt_height;
        this.edt_weight=edt_weight;
        this.edt_pressure=edt_pressure;
        this.edt_phone=edt_phone;
        this.edt_cellphone=edt_cellphone;
        this.edt_email=edt_email;
        this.rbtn_drink_yes=rbtn_drink_yes;
        this.rbtn_drink_no=rbtn_drink_no;
        this.rbtn_eat_yes=rbtn_eat_yes;
        this.rbtn_eat_no=rbtn_eat_no;
        this.edt_smoking_year=edt_smoking_year;
        this.rbtn_one_1=rbtn_one_1;
        this.rbtn_one_2=rbtn_one_2;
        this.rbtn_one_3=rbtn_one_3;
        this.rbtn_one_4=rbtn_one_4;
        this.rbtn_two_1=rbtn_two_1;
        this.rbtn_two_2=rbtn_two_2;
        this.rbtn_three_1=rbtn_three_1;
        this.rbtn_three_2=rbtn_three_2;
        this.rbtn_four_1=rbtn_four_1;
        this.rbtn_four_2=rbtn_four_2;
        this.rbtn_four_3=rbtn_four_3;
        this.rbtn_four_4=rbtn_four_4;
        this.rbtn_five_1=rbtn_five_1;
        this.rbtn_five_2=rbtn_five_2;
        this.rbtn_six_1=rbtn_six_1;
        this.rbtn_six_2=rbtn_six_2;
        this.rbtn_2_one_1=rbtn_2_one_1;
        this.rbtn_2_one_2=rbtn_2_one_2;
        this.rbtn_for_health=rbtn_for_health;
        this.rbtn_for_finance=rbtn_for_finance;
        this.rbtn_for_family=rbtn_for_family;
        this.rbtn_for_others=rbtn_for_others;
        this.rbtn_3_three_1=rbtn_3_three_1;
        this.rbtn_3_three_2=rbtn_3_three_2;
        this.rbtn_3_three_3=rbtn_3_three_3;
        this.rbtn_3_three_4=rbtn_3_three_4;
        this.rbtn_3_three_5=rbtn_3_three_5;
        this.rbtn_3_three_6=rbtn_3_three_6;
        this.rbtn_3_four_1=rbtn_3_four_1;
        this.rbtn_3_four_2=rbtn_3_four_2;
        this.rbtn_3_four_3=rbtn_3_four_3;
        this.rbtn_3_four_4=rbtn_3_four_4;
        this.rbtn_3_four_5=rbtn_3_four_5;
        this.rbtn_3_four_6=rbtn_3_four_6;
        this.rbtn_3_five_1=rbtn_3_five_1;
        this.rbtn_3_five_2=rbtn_3_five_2;
        this.rbtn_3_five_3=rbtn_3_five_3;
        this.rbtn_3_five_4=rbtn_3_five_4;
        this.rbtn_3_five_5=rbtn_3_five_5;
        this.rbtn_3_five_6=rbtn_3_five_6;
        this.rbtn_3_five_7=rbtn_3_five_7;
        this.rbtn_3_five_8=rbtn_3_five_8;
        this.rbtn_3_five_9=rbtn_3_five_9;
        this.diveser=diveser;
        this.medicine=medicine;*/
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getedt_id() {
        return edt_id;
    }
    public void setedt_id(String edt_id) {
        this.edt_id = edt_id;
    }

    public String getedt_birthday() {
        return edt_birthday;
    }
    public void setedt_birthday(String edt_birthday) {
        this.edt_birthday = edt_birthday;
    }

    public String getedt_age() {
        return edt_age;
    }
    public void setedt_age(String edt_age) {
        this.edt_age = edt_age;
    }

    public String getrbtn_outpatient() {
        return rbtn_outpatient;
    }
    public void setrbtn_outpatient(String rbtn_outpatient) {
        this.rbtn_outpatient = rbtn_outpatient;
    }

    public String getRbtn_gender() {
        return rbtn_gender;
    }
    public void setRbtn_gender(String rbtn_gender) {
        this.rbtn_gender = rbtn_gender;
    }

    public String getRbtn_marriage() {
        return rbtn_marriage;
    }
    public void setRbtn_marriage(String rbtn_marriage) {
        this.rbtn_marriage = rbtn_marriage;
    }

    /*public String getrbtn_inpatient() {
        return rbtn_inpatient;
    }
    public void setrbtn_inpatient(String rbtn_inpatient) {
        this.rbtn_inpatient = rbtn_inpatient;
    }

    public String getrbtn_emergency() {
        return rbtn_emergency;
    }
    public void setrbtn_emergency(String rbtn_emergency) {
        this.rbtn_emergency = rbtn_emergency;
    }

    public String getrbtn_society() {
        return rbtn_society;
    }
    public void setrbtn_society(String rbtn_society) {
        this.rbtn_society = rbtn_society;
    }
      public String getrbtn_male() {
        return rbtn_male;
    }

    public void setrbtn_male(String rbtn_male) {
        this.rbtn_male = rbtn_male;
    }
    public String getrbtn_female() {
        return rbtn_female;
    }

    public void setrbtn_female(String rbtn_female) {
        this.rbtn_female = rbtn_female;
    }
    public String getrbtn_single() {
        return rbtn_single;
    }

    public void setrbtn_single(String rbtn_single) {
        this.rbtn_single = rbtn_single;
    }
    public String getrbtn_marriage() {
        return rbtn_marriage;
    }

    public void setrbtn_marriage(String rbtn_marriage) {
        this.rbtn_marriage = rbtn_marriage;
    }
    public String getrbtn_marriage_others() {
        return rbtn_marriage_others;
    }

    public void setrbtn_marriage_others(String age) {
        this.rbtn_marriage_others = rbtn_marriage_others;
    }
    public String getrbtn_pregnant_yes() {
        return rbtn_pregnant_yes;
    }

    public void setrbtn_pregnant_yes(String rbtn_pregnant_yes) {
        this.rbtn_pregnant_yes = rbtn_pregnant_yes;
    }
    public String getrbtn_pregnant_no() {
        return rbtn_pregnant_no;
    }

    public void setrbtn_pregnant_no(String rbtn_pregnant_no) {
        this.rbtn_pregnant_no = rbtn_pregnant_no;
    }
    public String getedt_address() {
        return edt_address;
    }

    public void setedt_address(String edt_address) {
        this.edt_address = edt_address;
    }
    public String getrbtn_elementary() {
        return rbtn_elementary;
    }

    public void setrbtn_elementary(String rbtn_elementary) {
        this.rbtn_elementary = rbtn_elementary;
    }
    public String getrbtn_junior() {
        return rbtn_junior;
    }

    public void setrbtn_junior(String rbtn_junior) {
        this.rbtn_junior = rbtn_junior;
    }
    public String getrbtn_senior() {
        return rbtn_senior;
    }

    public void sertrbtn_senior(String rbtn_senior) {
        this.rbtn_senior = rbtn_senior;
    }
    public String getrbtn_college() {
        return rbtn_college;
    }

    public void setrbtn_college(String rbtn_college) {
        this.rbtn_college = rbtn_college;
    }
    public String getrbtn_university() {
        return rbtn_university;
    }

    public void setrbtn_university(String rbtn_university) {
        this.rbtn_university = rbtn_university;
    }
    public String getrbtn_graduate() {
        return rbtn_graduate;
    }

    public void setrbtn_graduate(String rbtn_graduate) {
        this.rbtn_graduate = rbtn_graduate;
    }
    public String getedt_height() {
        return edt_height;
    }

    public void setedt_height(String edt_height) {
        this.edt_height = edt_height;
    }
    public String getedt_weight() {
        return edt_weight;
    }

    public void setedt_weight(String edt_weight) {
        this.edt_weight = edt_weight;
    }
    public String getedt_pressure() {
        return edt_pressure;
    }

    public void setedt_pressure(String edt_pressure) {
        this.edt_pressure = edt_pressure;
    }
    public String getedt_phone() {
        return edt_phone;
    }

    public void setedt_phone(String edt_phone) {
        this.edt_phone = edt_phone;
    }
    public String getedt_cellphone() {
        return edt_cellphone;
    }

    public void setedt_cellphone(String edt_cellphone) {
        this.edt_cellphone = edt_cellphone;
    }
    public String getedt_email() {
        return edt_email;
    }

    public void setedt_email(String edt_email) {
        this.edt_email = edt_email;
    }
    public String getrbtn_drink_yes() {
        return rbtn_drink_yes;
    }

    public void setrbtn_drink_yes(String rbtn_drink_yes) {
        this.rbtn_drink_yes = rbtn_drink_yes;
    }
    public String getrbtn_drink_no() {
        return rbtn_drink_no;
    }

    public void setrbtn_drink_no(String rbtn_drink_no) {
        this.rbtn_drink_no = rbtn_drink_no;
    }
    public String getrbtn_eat_yes() {
        return rbtn_eat_yes;
    }

    public void setrbtn_eat_yes(String rbtn_eat_yes) {
        this.rbtn_eat_yes = rbtn_eat_yes;
    }
    public String getrbtn_eat_no() {
        return rbtn_eat_no;
    }

    public void setrbtn_eat_no(String rbtn_eat_no) {
        this.rbtn_eat_no = rbtn_eat_no;
    }
    public String getedt_smoking_year() {
        return edt_smoking_year;
    }

    public void setedt_smoking_year(String edt_smoking_year) {
        this.edt_smoking_year = edt_smoking_year;
    }
    public String getrbtn_one_1() {
        return rbtn_one_1;
    }

    public void setrbtn_one_1(String rbtn_one_1) {
        this.rbtn_one_1 = rbtn_one_1;
    }
    public String getrbtn_one_2() {
        return rbtn_one_2;
    }

    public void setrbtn_one_2(String rbtn_one_2) {
        this.rbtn_one_2 = rbtn_one_2;
    }
    public String getrbtn_one_3() {
        return rbtn_one_3;
    }

    public void setrbtn_one_3(String rbtn_one_3) {
        this.rbtn_one_3 = rbtn_one_3;
    }
    public String getrbtn_one_4() {
        return rbtn_one_4;
    }

    public void setrbtn_one_4(String rbtn_one_4) {
        this.rbtn_one_4 = rbtn_one_4;
    }
    public String getrbtn_two_1() {
        return rbtn_two_1;
    }

    public void setrbtn_two_1(String rbtn_two_1) {
        this.rbtn_two_1 = rbtn_two_1;
    }
    public String getrbtn_two_2() {
        return rbtn_two_2;
    }

    public void setrbtn_two_2(String rbtn_two_2) {
        this.rbtn_two_2 = rbtn_two_2;
    }
    public String getrbtn_three_1() {
        return rbtn_three_1;
    }

    public void setrbtn_three_1(String rbtn_three_1) {
        this.rbtn_three_1 = rbtn_three_1;
    }
    public String getrbtn_three_2() {
        return rbtn_three_2;
    }

    public void setrbtn_three_2(String rbtn_three_2) {
        this.rbtn_three_2 = rbtn_three_2;
    }
    public String getrbtn_four_1() {
        return rbtn_four_1;
    }

    public void setrbtn_four_1(String rbtn_four_1) {
        this.rbtn_four_1 = rbtn_four_1;
    }
    public String getrbtn_four_2() {
        return rbtn_four_2;
    }

    public void setrbtn_four_2(String rbtn_four_2) {
        this.rbtn_four_2 = rbtn_four_2;
    }
    public String getrbtn_four_3() {
        return rbtn_four_3;
    }

    public void setrbtn_four_3(String rbtn_four_3) {
        this.rbtn_four_3 = rbtn_four_3;
    }
    public String getrbtn_four_4() {
        return rbtn_four_4;
    }

    public void setrbtn_four_4(String rbtn_four_4) {
        this.rbtn_four_4 = rbtn_four_4;
    }
    public String getrbtn_five_1() {
        return rbtn_five_1;
    }

    public void setrbtn_five_1(String rbtn_five_1) {
        this.rbtn_five_1 = rbtn_five_1;
    }
    public String getrbtn_five_2() {
        return rbtn_five_2;
    }

    public void setrbtn_five_2(String rbtn_five_2) {
        this.rbtn_five_2 = rbtn_five_2;
    }
    public String getrbtn_six_1() {
        return rbtn_six_1;
    }

    public void setrbtn_six_1(String rbtn_six_1) {
        this.rbtn_six_1 = rbtn_six_1;
    }
    public String getrbtn_six_2() {
        return rbtn_six_2;
    }

    public void setrbtn_six_2(String rbtn_six_2) {
        this.rbtn_six_2 = rbtn_six_2;
    }
    public String getrbtn_2_one_1() {
        return rbtn_2_one_1;
    }

    public void setrbtn_2_one_1(String rbtn_2_one_1) {
        this.rbtn_2_one_1 = rbtn_2_one_1;
    }
    public String getrbtn_2_one_2() {
        return rbtn_2_one_2;
    }

    public void setrbtn_2_one_2(String rbtn_2_one_2) {
        this.rbtn_2_one_2 = rbtn_2_one_2;
    }
    public String getrbtn_for_health() {
        return rbtn_for_health;
    }

    public void setrbtn_for_health(String rbtn_for_health) {
        this.rbtn_for_health = rbtn_for_health;
    }
    public String getrbtn_for_finance() {
        return rbtn_for_finance;
    }

    public void setrbtn_for_finance(String rbtn_for_finance) {
        this.rbtn_for_finance = rbtn_for_finance;
    }
    public String getrbtn_for_family() {
        return rbtn_for_family;
    }

    public void setrbtn_for_family(String rbtn_for_family) {
        this.rbtn_for_family = rbtn_for_family;
    }
    public String getrbtn_for_others() {
        return rbtn_for_others;
    }

    public void setrbtn_for_others(String rbtn_for_others) {
        this.rbtn_for_others = rbtn_for_others;
    }
    public String getrbtn_3_three_1() {
        return rbtn_3_three_1;
    }

    public void setrbtn_3_three_1(String rbtn_3_three_1) {
        this.rbtn_3_three_1 = rbtn_3_three_1;
    }
    public String getrbtn_3_three_2() {
        return rbtn_3_three_2;
    }

    public void setrbtn_3_three_2(String rbtn_3_three_2) {
        this.rbtn_3_three_2 = rbtn_3_three_2;
    }
    public String getrbtn_3_three_3() {
        return rbtn_3_three_3;
    }

    public void setrbtn_3_three_3(String rbtn_3_three_3) {
        this.rbtn_3_three_3 = rbtn_3_three_3;
    }
    public String getrbtn_3_three_4() {
        return rbtn_3_three_4;
    }

    public void setrbtn_3_three_4(String rbtn_3_three_4) {
        this.rbtn_3_three_4 = rbtn_3_three_4;
    }
    public String getrbtn_3_three_5() {
        return rbtn_3_three_5;
    }

    public void setrbtn_3_three_5(String rbtn_3_three_5) {
        this.rbtn_3_three_5 = rbtn_3_three_5;
    }
    public String getrbtn_3_three_6() {
        return rbtn_3_three_6;
    }

    public void setrbtn_3_three_6(String rbtn_3_three_6) {
        this.rbtn_3_three_6 = rbtn_3_three_6;
    }
    public String getrbtn_3_four_1() {
        return rbtn_3_four_1;
    }

    public void setrbtn_3_four_1(String rbtn_3_four_1) {
        this.rbtn_3_four_1 = rbtn_3_four_1;
    }
    public String getrbtn_3_four_2() {
        return rbtn_3_four_2;
    }

    public void setrbtn_3_four_2(String rbtn_3_four_2) {
        this.rbtn_3_four_2 = rbtn_3_four_2;
    }
    public String getrbtn_3_four_3() {
        return rbtn_3_four_3;
    }

    public void rbtn_3_four_3(String rbtn_3_four_3) {
        this.rbtn_3_four_3 = rbtn_3_four_3;
    }
    public String getrbtn_3_four_4() {
        return rbtn_3_four_4;
    }

    public void rbtn_3_four_4(String rbtn_3_four_4) {
        this.rbtn_3_four_4 = rbtn_3_four_4;
    }
    public String getrbtn_3_four_5() {
        return rbtn_3_four_5;
    }

    public void rbtn_3_four_5(String rbtn_3_four_5) {
        this.rbtn_3_four_5 = rbtn_3_four_5;
    }
    public String getrbtn_3_four_6() {
        return rbtn_3_four_6;
    }

    public void setrbtn_3_four_6(String rbtn_3_four_6) {
        this.rbtn_3_four_6 = rbtn_3_four_6;
    }
    public String getrbtn_3_five_1() {
        return rbtn_3_five_1;
    }

    public void setrbtn_3_five_1(String rbtn_3_five_1) {
        this.rbtn_3_five_1 = rbtn_3_five_1;
    }
    public String getrbtn_3_five_2() {
        return rbtn_3_five_2;
    }

    public void setrbtn_3_five_2(String rbtn_3_five_2) {
        this.rbtn_3_five_2 = rbtn_3_five_2;
    }
    public String getrbtn_3_five_3() {
        return rbtn_3_five_3;
    }

    public void setrbtn_3_five_3(String rbtn_3_five_3) {
        this.rbtn_3_five_3 = rbtn_3_five_3 ;
    }
    public String getrbtn_3_five_4() {
        return rbtn_3_five_4;
    }

    public void setrbtn_3_five_4(String rbtn_3_five_4) {
        this.rbtn_3_five_4 = rbtn_3_five_4;
    }
    public String getrbtn_3_five_5() {
        return rbtn_3_five_5;
    }

    public void setrbtn_3_five_5(String rbtn_3_five_5) {
        this.rbtn_3_five_5 = rbtn_3_five_5;
    }
    public String getrbtn_3_five_6() {
        return rbtn_3_five_6;
    }

    public void setrbtn_3_five_6(String rbtn_3_five_6) {
        this.rbtn_3_five_6 = rbtn_3_five_6;
    }
    public String getrbtn_3_five_7() {
        return rbtn_3_five_7;
    }

    public void setrbtn_3_five_7(String rbtn_3_five_7) {
        this.rbtn_3_five_7 = rbtn_3_five_7;
    }
    public String getrbtn_3_five_8() {
        return rbtn_3_five_8;
    }

    public void setrbtn_3_five_8(String rbtn_3_five_8) {
        this.rbtn_3_five_8 = rbtn_3_five_8;
    }
    public String getgetrbtn_3_five_9() {
        return rbtn_3_five_9;
    }

    public void getrbtn_3_five_9(String getrbtn_3_five_9) {
        this.rbtn_3_five_9 = getrbtn_3_five_9;
    }
    public String getdiveser() {
        return diveser;
    }

    public void setdiveser(String diveser) {
        this.diveser = diveser;
    }
    public String getmedicine() {
        return medicine;
    }

    public void setmedicine(String medicine) {
        this.medicine = medicine;
    }*/
}
