package com.company;

public class House {
    Room rooms;
    Door mainDoor;

    public void House(){
        this.rooms = new Room();
        this.mainDoor = this.rooms.getDoor();
    }

}
