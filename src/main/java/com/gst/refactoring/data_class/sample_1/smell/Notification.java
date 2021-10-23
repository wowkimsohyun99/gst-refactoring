package com.gst.refactoring.data_class.sample_1.smell;

public class Notification {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.setDate("15/08");
        alarm.setTime("06:00");
        startDay(alarm.getTime());
        newYear(alarm.getDate(), alarm.getTime());
        midAutumnFestival(alarm.getDate());
    }

    public static void startDay(String time) {
        if (time.equals("06:00")) {
            System.out.println("It 's morning");
        }
    }

    public static void newYear(String date, String time) {
        if(date.equals("01/01") && time.equals("00:00")) {
            System.out.println("New year");
        }
    }

    public static void midAutumnFestival(String date) {
        if(date.equals("15/08")) {
            System.out.println("It 's Mid Autumn Festival");
        }
    }
}
