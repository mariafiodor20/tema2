package com.company;

public class Dacia extends Car{

    public Dacia(){

    }

    public Dacia(String name){

        super.Car(name);
    }

    public Dacia(int cylinders){
        super.Car(cylinders);
    }

    public Dacia(String name, int cylinders){
        super.Car(name, cylinders);
    }

    @Override
    public String getName() {
        System.out.println("getting the name from Dacia");
        return name;
    }

    @Override
    public int getCylinders() {
        System.out.println("getting the cylinders from Dacia");
        return cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("getting the wheels from Dacia");
        return wheels;
    }

    @Override
    public boolean isEngine() {
        System.out.println("getting the engine from Dacia");
        return engine;
    }
}
