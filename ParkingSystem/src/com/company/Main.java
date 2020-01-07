package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opt;
        int count=0;
        int lot=3;

        Scanner input= new Scanner(System.in);
        Car car=new Car();
        Van van=new Van();
        DateTime dateTime=new DateTime();
        Motorbike motorbike = new Motorbike();
        while (count<lot) {
            System.out.println("Entered Date and Time (dd/mm/yyyy - hh-mm):");
            dateTime.setDateNtime(input.next());
            System.out.println("Enter type of vehicle:");
            System.out.println("1).car");
            System.out.println("2).van");
            System.out.println("3).motor bike");
            opt = input.nextInt();
            if(opt==2){
                count+=2;
                if (count>lot){
                    System.exit(0);
                    System.out.println("space full !");

                }
            }
            else {
                count++;
            }
            switch (opt) {
                case 1:
                    System.out.println("Enter id plate:");
                    car.setIdPlate(input.next());
                    System.out.println("Enter brand:");
                    car.setBrand(input.next());
                    System.out.println("Enter no of doors:");
                    car.setNoOfDoors(input.nextInt());
                    System.out.println("Enter colour:");
                    car.setColour(input.next());


                    break;
                case 2:
                    System.out.println("Enter id plate:");
                    van.setIdPlate(input.next());
                    System.out.println("Enter brand:");
                    van.setBrand(input.next());
                    System.out.println("Enter cargo volume:");
                    van.setCargoVolume(input.nextInt());

                    break;
                case 3:
                    System.out.println("Enter id plate:");
                    motorbike.setIdPlate(input.next());
                    System.out.println("Enter brand:");
                    motorbike.setBrand(input.next());
                    System.out.println("Enter engine Size:");
                    motorbike.setEngineSize(input.next());

                    break;
                default:
                    System.out.println("invalid input !");
                    break;
            }

            }

        }

    }

