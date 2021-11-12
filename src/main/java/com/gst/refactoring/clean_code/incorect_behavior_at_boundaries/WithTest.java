package com.gst.refactoring.clean_code.incorect_behavior_at_boundaries;

public class WithTest {

    public int convertStringToIntNumber(String n) {
        int number;
        try {
            number = Integer.parseInt(n);
            return number;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
