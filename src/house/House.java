package house;

public class House {
    public  House(){

    }
    private  int numberOfRooms;
    private boolean garage;
    private String houseType;
    private int price;

    //House type
    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    //Number of rooms
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    //House price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Garage
    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }



    // Constructor
    public House(int numberOfRooms, int price, String houseType, boolean garage){
        this.numberOfRooms = numberOfRooms;
        this.houseType = houseType;
        this.garage=garage;
        this.price = price;


        }
    public House(String houseType, boolean garage) {
        this(0,0,houseType,garage);
    }


    }













