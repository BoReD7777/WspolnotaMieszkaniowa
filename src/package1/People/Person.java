package package1.People;

import package1.House.House;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String email;
    private String phoneNumber;
    private House house;

    public Person(String firstName, String lastName, int age, String occupation, String email, String phoneNumber, House house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.house = house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
