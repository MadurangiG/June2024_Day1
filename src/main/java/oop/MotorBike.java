package oop;

public class MotorBike extends Vehicle {

    private boolean hasCarrier;
    public MotorBike(String make, String model, int year) {
        super(make, model, year);
//        this.hasCarrier=hasCarrier;
    }

    @Override
    public void start() {

    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean b) {
        this.hasCarrier = b;
    }

    //    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Is bike has a carrier? "+hasCarrier);
//        System.out.println("---------");
//
//    }
}
