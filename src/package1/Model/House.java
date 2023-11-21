package package1.Model;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int houseNumber;
    private boolean isFurnished;
    private CostManager costManager;
    private List<Person> occupants;
    private List<CommunityServices> services;


    public House(int houseNumber,CostManager costManager ) {
        this.houseNumber = houseNumber;
        this.costManager = costManager;
        this.occupants = new ArrayList<>();
        this.services = new ArrayList<>();
    }

    public void addOccupant(Person person){
        occupants.add(person);
        person.setHouse(this);
    }

    public void removeOccupant(Person person){
        occupants.remove(person);
        person.setHouse(null);
    }

}
