package com.gst.refactoring.feature_envy.refactoring;

public class User {
    //Move method
    public String getAddress(ContactInfor contactInfor) {
        return contactInfor.getAddress();
    }
}
