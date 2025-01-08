package org.example;



public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        Person person2 = new Person("Laz", "Ziya", 1.7, "Evli", 67, "Istanbul");

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Firstname: " + person2.getFirstName());

        System.out.println("LastName: " + person2.getLastName());

        System.out.println("Age: " + person2.getAge());

        System.out.println("Is person2 a teenager? " + person2.isTeen());

        Wall wall = new Wall(5,4);

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());



    }
}
