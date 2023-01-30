import house.House;

public class Main {
    public static void main(String[] args) {

        createHouses();
    }

    public static void createHouses() {

        //default constructor with dot notation
        House house1 = new House();
        House house2 = new House();

        house1.setHouseType("Terraced");
        house1.setPrice(200000);
        house1.setNumberOfRooms(4);
        house1.setGarage(true);
        message(house1);

        house2.setHouseType("Detached");
        house2.setPrice(400000);
        house2.setNumberOfRooms(7);
        house2.setGarage(false);
       message(house2);



        //Constructor
        House house3 = new House(4, 4000, "terraced", true);
        message(house3);

        //chaining
        House house4 = new House("detached", true);
        message2(house4);


    }
    public static void message2(House param) {

        String result = "house of type:" + param.getHouseType() + " " + (param.isGarage()?" with garage" :" with no garage") + " " + "location" + " " + House.getLocation();
        System.out.println(result);
    }

    public static void message(House param) {
        System.out.println( "House type has" + " " + param.getNumberOfRooms() + " " + "rooms" + " " + "and its current price is" + " " + param.getPrice());
    }


}


