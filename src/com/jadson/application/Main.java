package com.jadson.application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Manager manager = new Manager();

        manager.setName("Jadson Marliere de Oliveira");
        manager.setPassword(369369);

        manager.getSalary();
    }
}
