package com.gst.refactoring.feature_envy.smell;

public class User {
    public String getAddress(ContactInfor contactInfor) {
        String city = contactInfor.getCity();
        String street = contactInfor.getStreetName();
        String district = contactInfor.getDistrict();
        return street + "-" + district + "-" + city;
    }
}
