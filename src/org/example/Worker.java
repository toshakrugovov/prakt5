package org.example;

public class Worker extends Person {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя работника: " + name);
    }
}
