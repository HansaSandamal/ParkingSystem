package com.company;

public class Car extends Vehicle {
    private int noOfDoors;
    private String colour;

    public Car(String idPlate, String brand,String dateNtime,int noOfDoors, String colour) {
        super(idPlate, brand,dateNtime);
        this.noOfDoors = noOfDoors;
        this.colour = colour;
    }

    @Override
    public void setIdPlate(String idPlate) {
        super.setIdPlate(idPlate);

    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car() {
    }
}
