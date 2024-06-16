package oop;

public class Car extends Vehicle implements Drivable{
    int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors =numberOfDoors;
    }

    @Override
    public void start() {

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors of the car: "+numberOfDoors);
        startEngine();
        stopEngine();
        System.out.println("---------");

    }

    @Override
    public void startEngine() {
        System.out.println("Start the car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the car");

    }
}
