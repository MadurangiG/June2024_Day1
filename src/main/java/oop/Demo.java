package oop;

public class Demo {
    public static void main(String[] args){
        Vehicle car = new Car("Toyata","Vitz",2020,4);
        car.displayInfo();

        MotorBike bike = new MotorBike("Honda","CBR",2015);
        bike.setHasCarrier(true);
        bike.displayInfo();
        System.out.println("Having a carrier? "+bike.isHasCarrier());
        System.out.println("-------");


    }
}
