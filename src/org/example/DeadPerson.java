package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class DeadPerson extends Person {
    private String dateOfDeath;

    static Log deadlog;
    static{
        try{
            deadlog = new Log("dead.log", Level.INFO);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public DeadPerson(String name, String dateOfDeath) {
        super(name);
        this.dateOfDeath = dateOfDeath;
        deadlog.logger.info("Умерший удалёен");

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
