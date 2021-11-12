package com.gst.refactoring.feature_envy.refactoring;

public class ContactInfor {
    private String getStreetName() {
        return "Hà Huy Tập";
    }

    private String getCity() {
        return "Hà Nội";
    }

    private String getDistrict() {
        return "Yên Viên";
    }

    //Move method
    public String getAddress() {
        return getDistrict() + "-" + getStreetName() + "-" + getCity();
    }
}
