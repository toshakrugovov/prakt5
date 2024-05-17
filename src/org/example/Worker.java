package org.example;

import java.io.IOException;
import java.util.logging.Level;

public class Worker extends Person {

    static Log workerlog;
    static{
        try{
            workerlog = new Log("worker.log", Level.INFO);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public Worker(String name) {
        super(name);

        workerlog.logger.info("Работник добавлен");

    }

    @Override
    public void displayInfo() {
        System.out.println("Имя работника: " + name);
    }
}
