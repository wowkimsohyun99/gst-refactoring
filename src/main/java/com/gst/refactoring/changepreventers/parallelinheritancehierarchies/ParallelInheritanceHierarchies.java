package com.gst.refactoring.changepreventers.parallelinheritancehierarchies;

interface Car {
    String getType();
    void setType(String type);
    ShowRoom getShowRoom();
    void setShowRoom(ShowRoom showRoom);
}

interface ShowRoom {
    public String address();
}

class ToyotaCar implements Car {
    private String type;
    private ShowRoom showRoom;
   
    public void setType(String type) {
           this.type = type;
    }

    public void setShowRoom(ShowRoom showRoom) {
           this.showRoom = showRoom;
    }

    @Override
    public String getType() {
           return type;
    }

    @Override
    public ShowRoom getShowRoom() {
           return showRoom;
    }

    @Override
    public String toString() {
           return "Toyota [type=" + type + ", ShowRoom=" + showRoom + "]";
    }
   
   
}

class GiaiPhongShowRoom implements ShowRoom{

    @Override
    public String address() {
           return"365, Giải Phóng, Hoàng Mai, Hà Nội";
          
    }

    @Override
    public String toString() {
           return "GiaiPhongShowRoom [address()=" + address() + "]";
    }
   
}

class HondaCar implements Car{
      
    private String type;
    private ShowRoom showRoom;
   
   
   
    public void setType(String type) {
           this.type = type;
    }

    public void setShowRoom(ShowRoom showRoom) {
           this.showRoom = showRoom;
    }

    @Override
    public String getType() {
           return type;
    }

    @Override
    public ShowRoom getShowRoom() {
           return showRoom;
    }

    @Override
    public String toString() {
           return "HondaCar [type=" + type + ", showRoom=" + showRoom + "]";
    }
   
}

class PhamVanDongShowRoom implements ShowRoom{

    @Override
    public String address() {
           return "89, Phạm Văn Đồng, Bắc Từ Liêm, Hà Nội";
    }
   
    @Override
    public String toString() {
           return "PhamVanDongShowRoom [address()=" + address() + "]";
    }

}

class Manager {
      
    public static void main(String[] args) {
          
           Car toyo = new ToyotaCar();
           toyo.setType("Toyota car ");
           toyo.setShowRoom(new GiaiPhongShowRoom());
          
           Car honda = new HondaCar();
           honda.setType("Honda car");
           honda.setShowRoom(new PhamVanDongShowRoom());
          
           System.out.println(toyo);
           System.out.println("********************");
           System.out.println(honda);
           }
}