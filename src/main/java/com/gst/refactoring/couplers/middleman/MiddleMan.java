package com.gst.refactoring.couplers.middleman;

public class MiddleMan {

    private static class DataUtil {
        private Department department;
        private Address address;

        public DataUtil() {
            department = new Department();
            address = new Address();
        }

        private String getManager() {
            return department.getManager();
        }

        private String getAddressName(){
            return address.getAddressName();
        }
    }

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
        DataUtil dataUtil = new DataUtil();
        System.out.println("Manager:" + dataUtil.getManager());
        System.out.println("Address:" + dataUtil.getAddressName());
    }

}
