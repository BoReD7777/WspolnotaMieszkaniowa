package package1.House;
import package1.ActivityAndExpenses.CommunityServices;
import package1.People.Person;

import java.util.ArrayList;
import java.util.List;

public class House{

    private int houseNumber;
    private int cost;
    private String address;
    private List<Person> occupants;
    private List<CommunityServices> services;


    public House(int houseNumber, int cost, String address) {
        this.houseNumber = houseNumber;
        this.occupants = new ArrayList<>();
        this.services = new ArrayList<>();
        this.cost = cost;
        this.address = address;
    }



    public void addOccupant(Person person){
        occupants.add(person);
    }

    public void removeOccupant(Person person){
        occupants.remove(person);
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

    public List<CommunityServices> getServices() {
        return services;
    }

    public void setServices(List<CommunityServices> services) {
        this.services = services;
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
