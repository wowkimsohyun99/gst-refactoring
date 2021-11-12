package com.gst.refactoring.mesage_chains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String name;
    private List<Department> department;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Department {
        private String name;
        private Manager manager;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Manager {
        private String name;
        private Address address;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Address {
        private String houseNumber;
        private String city;
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setHouseNumber("102C20");
        address.setCity("Hà Nội");
        Manager manager = new Manager();
        manager.setName("Nguyen Van A");
        manager.setAddress(address);
        Department department = new Department();
        department.setName("Hanh chinh");
        department.setManager(manager);
        // --> message chains smell
        System.out.println("Address of manager is: " + department.getManager().getAddress().getHouseNumber() + " " + department.getManager().getAddress().getCity());
    }
}