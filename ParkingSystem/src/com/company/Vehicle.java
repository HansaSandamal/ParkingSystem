package com.company;

abstract public class Vehicle{
    private String idPlate;
    private String brand;
    private String dateNtime;

    public Vehicle(String idPlate, String brand,String dateNtime) {
        this.idPlate = idPlate;
        this.brand = brand;
        this.dateNtime= dateNtime;
    }

    public Vehicle(String dateNtime) {
    }

    public String getDateNtime() {
        return dateNtime;
    }

    public void setDateNtime(String dateNtime) {
        this.dateNtime = dateNtime;
    }

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle() {
    }
}
