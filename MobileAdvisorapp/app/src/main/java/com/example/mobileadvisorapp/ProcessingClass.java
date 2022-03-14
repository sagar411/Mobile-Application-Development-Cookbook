package com.example.mobileadvisorapp;

import java.util.ArrayList;
import java.util.List;

public class ProcessingClass {
    public List<String> getMobilePhones(String companyName){
        List<String> mobilePhones =new ArrayList<>();
        if("Samsung".equalsIgnoreCase(companyName)){
            mobilePhones.add("samsung Galaxy A7");
            mobilePhones.add("samsung Galaxy A3");
            mobilePhones.add("samsung Galaxy z+");
        }else if ("apple".equalsIgnoreCase(companyName)){
            mobilePhones.add("iPhone7");
            mobilePhones.add("iPhone8");
            mobilePhones.add("iPhone 9");
        }else if("Oppo".equalsIgnoreCase(companyName)){
            mobilePhones.add("Oppo1");
            mobilePhones.add("Oppo2");
            mobilePhones.add("Oppo3");
        }else if("vivo".equalsIgnoreCase(companyName)){
            mobilePhones.add("Vivo 1");
            mobilePhones.add("Vivo 2");
            mobilePhones.add("Vivo 3");

        }
        return mobilePhones;

    }
}
