package com.company;

public class Room {
    private int windows;
    private String sofas;
    private int walls;
    private Door door;

    public void Room(){
        this.door.setOpened(false);
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getSofas() {
        return sofas;
    }

    public void setSofas(String sofas) {
        this.sofas = sofas;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
