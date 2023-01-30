import house.House;

public class Main {
    public static void main(String[] args) {

      createHouses();
    }

    public static void createHouses(){

        //default constructor with dot notation
        House house1 = new House();
        House house2 = new House();

        house1.setHouseType("Terraced");
        house1.setPrice(200000);
        house1.setNumberOfRooms(4);
        house1.setGarage(true);
        System.out.println(house1.message());

        house2.setHouseType("Detached");
        house2.setPrice(400000);
        house2.setNumberOfRooms(7);
        house2.setGarage(false);
        System.out.println(house2.message());


        //Constructor
        House house3 = new House(4,4000,"terraced",true);
        System.out.println(house3.message());
    }
}