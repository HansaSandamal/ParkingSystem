package com.company;

public class Van extends Vehicle {
    private int cargoVolume;

    public Van(String idPlate, String brand,String dateNtime, int cargoVolume){
        super(idPlate, brand,dateNtime);
        this.cargoVolume=cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public Van(){

    }
}
