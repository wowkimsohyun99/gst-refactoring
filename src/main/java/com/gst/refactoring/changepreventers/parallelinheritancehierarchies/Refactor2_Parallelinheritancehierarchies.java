package com.gst.refactoring.changepreventers.parallelinheritancehierarchies;

interface Refactor2_Car {
    String getType();
    void setType(String type);
    String address();
}

class Refactor2_ToyotaShowroom implements Refactor2_Car{
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String address() {
        return"365, Giải Phóng, Hoàng Mai, Hà Nội";
    }

    @Override
    public String toString() {
        return "Toyota [type=" + type + ", ShowRoom=" + address() + "]";
    }
}

class Refactor2_HondaShowroom implements Refactor2_Car {
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String address() {
        return "89, Phạm Văn Đồng, Bắc Từ Liêm, Hà Nội";
    }

    @Override
    public String toString() {
        return "Honda [type=" + type + ", ShowRoom=" + address() + "]";
    }
}

public class Refactor2_Parallelinheritancehierarchies {
    public static void main(String[] args) {
        Refactor2_ToyotaShowroom toyotaShowroom = new Refactor2_ToyotaShowroom();
        toyotaShowroom.setType("Toyota");
        Refactor2_HondaShowroom hondaShowroom = new Refactor2_HondaShowroom();
        hondaShowroom.setType("Honda");
        System.out.println(toyotaShowroom);
        System.out.println("********************");
        System.out.println(hondaShowroom);
    }


}
