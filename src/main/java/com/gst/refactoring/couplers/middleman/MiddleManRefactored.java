package com.gst.refactoring.couplers.middleman;

public class MiddleManRefactored {

    private static class Department {
        private String getManager() {
            return "Cung Lâm";
        }
    }

    private static class Address {
        private String getAddressName() {
            return "Hoàng Mai";
        }
    }


    public static void main(String[] args) {
        System.out.println("Manager:"+ new Department().getManager());
        System.out.println("Address:"+ new Address().getAddressName());
    }

}
