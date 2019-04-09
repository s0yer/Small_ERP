package com.jadson.application;

public class Manager extends Employee{
    private int password;

    // Choose the access password
    // Escolhe a senha de acesso

    public void setPassword(int password){
        this.password = password;
    }

    // authenticates the manager
    // autentica o gerente

    public boolean authenticates(int password){
        if(this.password == password){
            System.out.println("Access allowed");
            return true;
        } else {
            System.out.println("Access Denied");
            return false;
        }
    }
}
