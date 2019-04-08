package com.jadson.application;

public class Manager extends Employee{
    private int password;

    // escolhe a senha de acesso
    public void setPassword(int password){
        this.password = password;
    }

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
