package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Person> deadPeople = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите услугу");
        System.out.println("1. Добавить работника");
        System.out.println("2. Добавить человека");
        System.out.println("3. Удалить человека");
        System.out.println("4. Выбрать способ захоронения");
        System.out.println("5. Выбрать время похорон");
        System.out.println("6. Выбрать количество гостей");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addWorker();
                break;
            case 2:
                addDeadPerson();
                break;
            case 3:
                deleteDeadPerson();
                break;
            case 4:
                selectBurialMethod();
                break;
            case 5:
                selectFuneralTime();
                break;
            case 6:
                selectNumberOfGuests();
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }

    public static void addWorker() {
        System.out.println("Введите имя работника:");
        String name = scanner.next();
        Worker worker = new Worker(name);
        worker.displayInfo();
    }

    public static void addDeadPerson() {
        System.out.println("Введите имя умершего:");
        String name = scanner.next();
        System.out.println("Введите дату смерти:");
        String dateOfDeath = scanner.next();
        DeadPerson deadPerson = new DeadPerson(name, dateOfDeath);
        deadPeople.add(deadPerson);
        deadPerson.displayInfo();
    }

    public static void deleteDeadPerson() {
        System.out.println("Введите номер покойника:");
        int index = scanner.nextInt();
        if (index >= 0 && index < deadPeople.size()) {
            deadPeople.remove(index);
            System.out.println("Покойник удален");
        } else {
            System.out.println("Неверный номер покойника");
        }
    }

    public static void selectBurialMethod() {
        System.out.println("Выберите способ захоронения:");
        System.out.println("1. Погребение");
        System.out.println("2. Кремация");
        System.out.println("3. Мумификация");
        int method = scanner.nextInt();
        switch (method) {
            case 1:
                System.out.println("Выбрано погребение");
                break;
            case 2:
                System.out.println("Выбрана кремация");
                break;
            case 3:
                System.out.println("Выбрана мумификация");
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }

    public static void selectFuneralTime() {
        System.out.println("Введите время похорон:");
        String time = scanner.next();
        System.out.println("Время похорон установлено на " + time);
    }

    public static void selectNumberOfGuests() {
        System.out.println("Введите количество гостей:");
        int numberOfGuests = scanner.nextInt();
        System.out.println("Количество гостей: " + numberOfGuests);
    }
}
