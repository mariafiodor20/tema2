package com.company;

import java.awt.*;

public class Car {
    protected String name;
    protected int cylinders;
    protected int wheels;
    protected boolean engine;

    public void Car(){

    }

    public void Car(String name){
        this.name = name;
        this.cylinders = 2;
        this.wheels = 4;
        this.engine = true;
    }

    public void Car(int cylinders){
        this.name = "No_Name";
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        System.out.println("getting the name");
        return name;
    }

    public int getCylinders() {
        System.out.println("getting the cylinders");
        return cylinders;
    }

    public int getWheels() {
        System.out.println("getting the wheels");
        return wheels;
    }

    public boolean isEngine() {
        System.out.println("getting the engine");
        return engine;
    }
}
