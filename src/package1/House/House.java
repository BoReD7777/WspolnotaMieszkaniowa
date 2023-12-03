package package1.House;
import package1.People.Person;

import java.util.List;
import java.util.ArrayList;

public class House{

    private int houseNumber;
    private int cost;
    private static String address;
    private static List<Person> occupants;
    private static int occupantCount;



    public House(int houseNumber, int cost, String address) {
        this.houseNumber = houseNumber;
        this.occupants = new ArrayList<>();
        this.cost = cost;
        this.address = address;
    }



    public void addOccupant(Person person){
        if(occupantCount < occupants.toArray().length){
            occupants.set(occupantCount++, person);
        }else{
            System.out.println("House is full");
        }
        occupants.add(person);
    }

    public void removeOccupant(Person person){
        for(int i = 0; i < occupantCount; i++){
            if(occupants.get(i).equals(person)){
                for(int j = i; j < occupantCount - 1; j++){
                    occupants.set(j, occupants.get(j + 1)); {
                            occupants.set(--occupantCount, null);
                            return;
                    }
                }
                System.out.println("Occupant not found in the house");
            }
        }
    }


    public List<Person> getOccupants() {
        return occupants;
    }

    public void setOccupants(List<Person> occupants) {
        this.occupants = occupants;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getOccupantCount() {
        return occupantCount;
    }

    public void setOccupantCount(int occupantCount) {
        this.occupantCount = occupantCount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
