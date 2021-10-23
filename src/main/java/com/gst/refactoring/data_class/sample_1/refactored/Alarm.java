package com.gst.refactoring.data_class.sample_1.refactored;

public class Alarm {
    private static final String DEFAULT_TIME_START_DAYLIGHT = "06:00";
    private static final String DEFAULT_TIME_START_DAY = "00:00";
    private static final String DEFAULT_DAY_START_YEAR = "01/01";
    private static final String DEFAULT_MID_AUTUMN_DAY = "15/08";
    private String date;
    private String time;

    public Alarm(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public void startDay() {
        if (this.time.equals(DEFAULT_TIME_START_DAYLIGHT)) {
            System.out.println("It 's morning");
        }
    }

    public void newYear() {
        if(this.date.equals(DEFAULT_DAY_START_YEAR) && this.time.equals(DEFAULT_TIME_START_DAY)) {
            System.out.println("New year");
        }
    }

    public void midAutumnFestival() {
        if(this.date.equals(DEFAULT_MID_AUTUMN_DAY)) {
            System.out.println("It 's Mid Autumn Festival");
        }
    }
}
