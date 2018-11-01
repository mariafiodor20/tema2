package com.company;

public class BMW extends Car {

    public BMW(){

    }

    public BMW(String name){
        this.name = name;
        this.cylinders = 3;
        this.wheels = 4;
        this.engine = true;
    }

    public BMW(int cylinders){
        this.name = "No_Name";
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public BMW(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    @Override
    public String getName() {
        System.out.println("getting the name from BMW");
        return name;
    }

    @Override
    public int getCylinders() {
        System.out.println("getting the cylinders from BMW");
        return cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("getting the wheels from BMW");
        return wheels;
    }

    @Override
    public boolean isEngine() {
        System.out.println("getting the engine from BMW");
        return engine;
    }

}
