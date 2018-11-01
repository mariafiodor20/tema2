package com.company;

public class Seat extends Car {

    public Seat(){

    }

    public Seat(String name){

        super.Car(name);
    }

    public Seat(int cylinders){
        super.Car(cylinders);
    }

    public Seat(String name, int cylinders){
        super.Car(name, cylinders);
    }

    @Override
    public String getName() {
        System.out.println("getting the name from Seat");
        return name;
    }

    @Override
    public int getCylinders() {
        System.out.println("getting the cylinders from Seat");
        return cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("getting the wheels from Seat");
        return wheels;
    }

    @Override
    public boolean isEngine() {
        System.out.println("getting the engine from Seat");
        return engine;
    }
}
