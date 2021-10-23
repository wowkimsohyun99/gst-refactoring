package com.gst.refactoring.data_class.sample_1.refactored;


public class Notification {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("15/08", "06:00");
        alarm.startDay();
        alarm.newYear();
        alarm.midAutumnFestival();
    }
}
