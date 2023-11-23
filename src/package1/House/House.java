package package1.House;

import package1.ActivityAndExpenses.CommunityServices;
import package1.ActivityAndExpenses.CostManager;
import package1.People.Person;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int houseNumber;
    private int cost;
    private String address;
    private CostManager costManager;
    private List<Person> occupants;
    private List<CommunityServices> services;


    public House(int houseNumber,CostManager costManager, int cost, String address) {
        this.houseNumber = houseNumber;
        this.costManager = costManager;
        this.occupants = new ArrayList<>();
        this.services = new ArrayList<>();
        this.cost = cost;
        this.address = address;
    }

    public void addOccupant(Person person){
        occupants.add(person);
        person.setHouse(this);
    }

    public void removeOccupant(Person person){
        occupants.remove(person);
        person.setHouse(null);
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

    public CostManager getCostManager() {
        return costManager;
    }

    public void setCostManager(CostManager costManager) {
        this.costManager = costManager;
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

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }
}
