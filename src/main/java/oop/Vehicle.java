package oop;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    private static int vehicleCount;

    public Vehicle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        vehicleCount++;

    }

    public abstract void start();
    public void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Vehicle count is: "+ vehicleCount);

    };
}
