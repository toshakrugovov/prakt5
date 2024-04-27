package org.example;

public class DeadPerson extends Person {
    private String dateOfDeath;

    public DeadPerson(String name, String dateOfDeath) {
        super(name);
        this.dateOfDeath = dateOfDeath;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя покойника: " + name);
        System.out.println("Дата смерти: " + dateOfDeath);
    }
}
