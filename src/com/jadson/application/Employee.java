package com.jadson.application;

public class Employee {
    private String name;
    private String cpf;
    private double salary;
    private boolean status;
    public double valReadjust;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getReadjust(){
        return this.salary * valReadjust;
    }

    public double getSalary() {
        return this.salary;
    }

}

