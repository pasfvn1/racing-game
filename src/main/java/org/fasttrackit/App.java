package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome tu the racing game");

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference. fuelLevel = 100;

//        carReference.engine = newEngine();
//        carReference.engine.manufactured = "vw";
//        carReference.engine.capacity =  2000

      Engine engine1 = new Engine();
      engine1.manufactured = "vw";
      engine1.capacity = 2000;

      carReference. engine = engine1;
      // one objesct with two references

        double curentDistance = carReference.accelerate(60, 1);
        System.out.println("Current distance:" + curentDistance);


        System.out.println("Engine details :");
        System.out.println( engine1.capacity);
        System.out.println(carReference. engine.capacity);

        engine1. capacity = 2100;
        System.out.println("Update engine details");
        System.out.println( engine1.capacity);
        System.out.println(carReference.engine. capacity);

        System.out.println("Propertis of " + carReference.name);
        System.out.println("color: " + carReference. color);
        System.out.println("maxSpeed: " + carReference. maxSpeed);
        System.out.println("mileage: " + carReference. mileage);
        System.out.println("fuel level: " + carReference. fuelLevel);
        System.out.println("racing number: " + carReference. racingNumber);
        System.out.println("damaged: " + carReference. damaged);

        carReference = null;

        Car car2 = new Car();
        car2. name = "Seat";
        car2. damaged = true;
        System.out.println("Properties of " + car2. name);
        System.out.println( "color: " + car2. color);
        System.out.println("damaged: " + car2. damaged);

        //modulo (modulus) operator
        System.out.println(4 % 2);
        System.out.println(4 % 2 == 0);
        System.out.println( 4 % 3);

;    }

}
