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
                new LuxuryHouse(2, true, 10, 300, 300, false, false, 99999, "st.marys", true),
                new LuxuryHouse(3, true, 7, 340, 300, true, false, 99999, "st.marys", true),
                new LuxuryHouse(4, true, 12, 300, 300, false, false, 99999, "st.marys", true),
                new LuxuryHouse(5, false, 10, 300, 300, false, true, 99999, "st.marys", true),
                new LuxuryHouse(6, false, 11, 350, 300, true, true, 99999, "st.marys", true),
                new LuxuryHouse(7, false, 12, 300, 300, false, true, 99999, "st.marys", true),
                new LuxuryHouse(8, true, 10, 200, 300, true, false, 99999, "st.marys", true),
                new LuxuryHouse(9, true, 4, 100, 300, true, true, 99999, "st.marys", true),
                new LuxuryHouse(10,false, 6, 200, 300, true, true, 99999, "st.marys", true)

        };

        LuxuryHouse house1 = new LuxuryHouse(1, false, 15, 450, 500, true, true, 99999, "st.mary, 1", true);
        LuxuryHouse house2 = new LuxuryHouse(2, true, 10, 300, 300, false, false, 99999, "st.marys", true);
        LuxuryHouse house3 = new LuxuryHouse(3, true, 7, 340, 300, true, false, 99999, "st.marys", true);
        LuxuryHouse house4 = new LuxuryHouse(4, true, 12, 300, 300, false, false, 99999, "st.marys", true);
        LuxuryHouse house5 = new LuxuryHouse(5, false, 10, 300, 300, false, true, 99999, "st.marys", true);
        LuxuryHouse house6 = new LuxuryHouse(6, false, 11, 350, 300, true, true, 99999, "st.marys", true);
        LuxuryHouse house7 = new LuxuryHouse(7, false, 12, 300, 300, false, true, 99999, "st.marys", true);
        LuxuryHouse house8 = new LuxuryHouse(8, true, 10, 200, 300, true, false, 99999, "st.marys", true);
        LuxuryHouse house9 = new LuxuryHouse(9, true, 4, 100, 300, true, true, 99999, "st.marys", true);
        LuxuryHouse house10 = new LuxuryHouse(10,false, 6, 200, 300, true, true, 99999, "st.marys", true);

        Person person1 = new Person("mary", "jane", 34, "mechanic", "mary.jane@email.com", 345365298);
        Person person2 = new Person("Unn", "Bird", 34, "cleaner", "mary.jane@email.com", 325365298);
        Person person3 = new Person("Krišs", "Krišs", 34, "waiter", "mary.jane@email.com", 335365298);
        Person person4 = new Person("Caesar", "Rizzi", 34, "surgeon", "mary.jane@email.com", 344365298);
        Person person5 = new Person("Sunshine", "Borisov", 34, "nurse", "mary.jane@email.com", 355365298);
        Person person6 = new Person("Xanthippos", "Stenger", 34, "doctor", "mary.jane@email.com", 645365298);
        Person person7 = new Person("Erja ", "Martinson", 34, "driver", "mary.jane@email.com", 347365298);
        Person person8 = new Person("Jǫrmungandr", "Jephson", 34, "politician", "mary.jane@email.com", 385365298);
        Person person9 = new Person("Dobroslava", "Mäkelä", 34, "unemployed", "mary.jane@email.com", 345395298);
        Person person10 = new Person("Mäkelä", "Christiansen", 34, "teacher", "mary.jane@email.com", 245365298);
        Person person11 = new Person("Leocadius", "Ślusarczyk", 34, "singer", "mary.jane@email.com", 145365298);
        Person person12 = new Person("Abigail", "Ó hIfearnáin", 34, "writer", "mary.jane@email.com", 355365298);
        Person person13 = new Person("Manisha", "Cuijper", 34, "artist", "mary.jane@email.com", 345367298);
        Person person14 = new Person("Suero", "Vargas", 34, "painter", "mary.jane@email.com", 345365268);
        Person person15 = new Person("Ryō", "Czajkowski", 34, "cleaner", "mary.jane@email.com", 345355298);
        Person person16 = new Person("Shadrach", "Shadrach ", 34, "cleaner", "mary.jane@email.com", 345365298);
        Person person17 = new Person("Chetan", "Navrátil", 34, "unemployed", "mary.jane@email.com", 345465298);
        Person person18 = new Person("Blai", "Karimov   ", 34, "driver", "mary.jane@email.com", 345335298);
        Person person19 = new Person("Kyoko", "Herceg", 34, "doctor", "mary.jane@email.com", 345365698);
        Person person20 = new Person("Hrotsuitha", "Øster", 34, "cleaner", "mary.jane@email.com", 342365298);


        house1.addOccupant(person1);
        house1.addOccupant(person2);
        house2.addOccupant(person3);
        house2.addOccupant(person4);
        house3.addOccupant(person5);
        house3.addOccupant(person6);
        house4.addOccupant(person7);
        house4.addOccupant(person8);
        house5.addOccupant(person9);
        house5.addOccupant(person10);
        house6.addOccupant(person11);
        house6.addOccupant(person12);
        house7.addOccupant(person13);
        house7.addOccupant(person14);
        house8.addOccupant(person15);
        house8.addOccupant(person16);
        house9.addOccupant(person17);
        house9.addOccupant(person18);
        house10.addOccupant(person19);
        house10.addOccupant(person20);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Select what you want to do:");
        System.out.println("1. Add an occupant");
        System.out.println("2. Remove an occupant");
        System.out.println("3. Use the cost manager");
        System.out.println("4. Display occupants");
        System.out.println("5. EXIT");
        int actionChoice = scanner1.nextInt();

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        houses.add(house5);
        houses.add(house6);
        houses.add(house7);
        houses.add(house8);
        houses.add(house9);
        houses.add(house10);

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
                House selectedHouseToRemove = promptForHouse(houses);
                if (selectedHouseToRemove != null) {
                    displayOccupants(selectedHouseToRemove);
                    System.out.println("Enter the index of the occupant to remove:");
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
                    String formatedCost = String.format("%.2f" , costManager.calculateTotalCost());
                    System.out.printf("Total monthly cost for house " + houseNumber + ": " + formatedCost + "zł");
                } else {
                    System.out.println("House not found");
                }
            }
            case 4 -> {

                displayOccupants(house1);

            }

            case 5 -> {
                break;
            }

            default -> System.out.println("Invalid choice.");
        }





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