package package1;

import package1.ActivityAndExpenses.CostManager;
import package1.House.House;
import package1.House.LuxuryHouse;
import package1.People.Person;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        LuxuryHouse[] house = {
                new LuxuryHouse(1, false, 15, 450, 500, true, true, 99999, "st.mary", true),
                new LuxuryHouse(2, true, 10, 300, 300, false, false, 99999, "st.marys", true)

        };

        LuxuryHouse house1 = new LuxuryHouse(1, false, 15, 450, 500, true, true, 99999, "st.mary", true);

        Person person1 = new Person("mary", "jane", 34, "house", "mary.jane@email.com", 345365298);

        // house1.addOccupant(person1);

       // displayOccupants(house1);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Select what you want to do:");
        System.out.println("1. Add an occupant");
        System.out.println("2. Remove an occupant");
        System.out.println("3. Use the cost manager");
        System.out.println("4. EXIT");
        int actionChoice = scanner1.nextInt();

        List<House> houses = new ArrayList<>();
        houses.add(house1);

        List<Person> people = new ArrayList<>();
        people.add(person1);

        switch (actionChoice) {
            case 1 -> {
                //TODO FUNKCJA NIE ZAPISUJE OSOB KTORE ZOSTAŁY DODANE WIEC REMOVE OCUPANTS NIE DZIAŁA
                Person newOccupant =  promptForPerson();
                House selectedHouseToAdd = promptForHouse(houses);
                if (selectedHouseToAdd != null) {
                    selectedHouseToAdd.addOccupant(newOccupant);
                    System.out.println("Occupant added successfully to " + selectedHouseToAdd.getAddress() + " ." + selectedHouseToAdd.getHouseNumber());
                } else {
                    System.out.println("Invalid house choice.");
                }
            }
            case 2 -> {
                //TODO CHUJNIA Z TYM ZAPISYWANIEM DODANYCH OSÓB
                House selectedHouseToRemove = promptForHouse(houses);
                if (selectedHouseToRemove != null) {
                    displayOccupants(selectedHouseToRemove);
                    System.out.println("Enter the index of the occupant to remove:");
                    //TODO SPROBUJ ABY USUWAC OSOBY ZA POMOCĄ IMIENIA I NAZWISKA
                    int indexToRemove = scanner1.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < selectedHouseToRemove.getOccupants().size()) {
                        selectedHouseToRemove.removeOccupant(selectedHouseToRemove.getOccupants().get(indexToRemove));
                        System.out.println("Occupant removed successfully from " + selectedHouseToRemove.getAddress());
                    } else {
                        System.out.println("Invalid index.");
                    }
                } else {
                    System.out.println("Invalid house choice.");
                }
            }
            case 3 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your house number: ");
                int houseNumber = scanner.nextInt();
                LuxuryHouse userHouse = findHouseByNumber(house, houseNumber);
                if (userHouse != null) {
                    CostManager costManager = new CostManager(0, 0, 0, 0, 0, 0, 0);
                    costManager.updateWaterUsage(userHouse);
                    costManager.updateElectricityUsage(userHouse);
                    costManager.updateGasUsage(userHouse);
                    costManager.updateInternetUsage(userHouse);
                    costManager.updateGarbageDisposalRatePerPerson(userHouse);
                    costManager.updateSolarPanelUsage(userHouse);
                    System.out.println("Total monthly cost for house " + houseNumber + ": " + costManager.calculateTotalCost() + "zł");
                } else {
                    System.out.println("House not found");
                }
            }
            case 4 -> {
                    break;
            }

            default -> System.out.println("Invalid choice.");
        }


        displayOccupants(house1);


    }

    private static Person promptForPerson() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the name of the occupant: ");
        String firstName = scanner2.next();
        System.out.println("Enter the surname of the occupant: ");
        String lastName = scanner2.next();
        System.out.println("Enter their occupation: ");
        String occupation = scanner2.next();
        System.out.println("Enter their email: ");
        String email = scanner2.next();
        System.out.println("Enter their phone number: ");
        int phoneNumber = scanner2.nextInt();
        System.out.println("Enter their age");
        int age = scanner2.nextInt();
        return new Person(firstName, lastName, age, occupation, email, phoneNumber);
    }


    private static House promptForHouse(List<House> houses) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Select a house:");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println((i + 1) + ". " + houses.get(i).getAddress());
        }
        int houseChoice = scanner1.nextInt();

        if (houseChoice >= 1 && houseChoice <= houses.size()) {
            return houses.get(houseChoice - 1);
        } else {
            return null;
        }
    }


    private static void displayOccupants(House house) {
        System.out.println("Occupants: ");
        List<Person> occupants = house.getOccupants();
        for (int i = 0; i < occupants.size(); i++) {
            Person occupant = occupants.get(i);
            // TODO MOZNA WSM POZNIEJ POPATRZEC CZY DA SIE DAC DOM DO KTOREGO ZOSTAL DODANY
            System.out.println((i + 1) + ". " + occupant.getFirstName() + " " + occupant.getLastName() + ", Age: " + occupant.getAge() + ", Occupation: " + occupant.getOccupation() + ", Email: " + occupant.getEmail() + ", Phone number: " + occupant.getPhoneNumber());
        }
        if (occupants.isEmpty()) {
            System.out.println("No occupants in the house");
        }




    }

    private static LuxuryHouse findHouseByNumber(LuxuryHouse[] houses, int houseNumber) {
        for (LuxuryHouse house : houses) {
            if (house.getHouseNumber() == houseNumber) {
                return house;
            }
        }
        return null;
    }

}