package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double boy;
    String medeniDurum;
    String dogumYeri;

    public Person(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }
    public Person(String firstname, String lastName, double boy, String medeniDurum ,int age, String dogumYeri) {
        this(firstname,lastName,age);
        this.medeniDurum =medeniDurum;
        this.boy = boy;
        this.dogumYeri =dogumYeri;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
}
