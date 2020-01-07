package com.company;

public class Motorbike extends Vehicle {
    private String engineSize;

    public Motorbike(String idPlate, String brand,String dateNtime, String engineSize) {
        super(idPlate, brand,dateNtime);
        this.engineSize = engineSize;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
    public Motorbike(){

    }
}
