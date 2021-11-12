package com.gst.refactoring.clean_code.incorect_behavior_at_boundaries;

public class WithoutTest {
    public static void main(String[] args) {
        System.out.println(convertStringToIntNumber("123"));
        System.out.println(convertStringToIntNumber("-2147483648"));
        System.out.println(convertStringToIntNumber("12345679000"));
    }

    public static int convertStringToIntNumber(String n) {
        int number = Integer.parseInt(n);
        return number;
    }
}