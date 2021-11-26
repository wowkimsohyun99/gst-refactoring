package com.gst.refactoring.changepreventers.parallelinheritancehierarchies;

interface RefectorCar {
    String getType();
    void setType(String type);
    RefectorShowRoom getShowRoom();
    void setShowRoom(RefectorShowRoom showRoom);
}

interface RefectorShowRoom {
    public String address();
}

class ToyotaShowroom implements RefectorCar, RefectorShowRoom {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setShowRoom(RefectorShowRoom showRoom) {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public RefectorShowRoom getShowRoom() {
        return this;
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
class HondaShowroom implements RefectorCar, RefectorShowRoom {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setShowRoom(RefectorShowRoom showRoom) {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public RefectorShowRoom getShowRoom() {
        return this;
    }


    @Override
    public String address() {
        return"89, Phạm Văn Đồng, Bắc Từ Liêm, Hà Nội";

    }

    @Override
    public String toString() {
        return "Honda [type=" + type + ", ShowRoom=" + address() + "]";
    }

}

class CarFactory {

    public static RefectorCar getCar(Class clazz) throws InstantiationException, IllegalAccessException
    {
        return (RefectorCar) clazz.newInstance();
    }
}

class RefectorParallelinheritancehierarchies {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        RefectorCar toyota = CarFactory.getCar(ToyotaShowroom.class);
        toyota.setType("Toyota");
        RefectorCar honda = CarFactory.getCar(HondaShowroom.class);
        honda.setType("Honda");
        System.out.println(toyota);
        System.out.println("********************");
        System.out.println(honda);
    }
}


