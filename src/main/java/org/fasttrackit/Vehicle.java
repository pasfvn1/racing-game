package org.fasttrackit;

public class Vehicle  {

    // instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
     double totalDistance;
    boolean damaged;

    public double accelerate (double speed, double durationInHours ){

        System.out.println( name + "is accelerating with " + speed + "km/h" + durationInHours + "h");

        //local variable
        double travelDistance =speed * durationInHours;
        System.out.println("Traveled distance: " + travelDistance);

        totalDistance += travelDistance;
        System.out.println("Total traveled distance:" + totalDistance);


        double usedFuel = travelDistance * mileage / 100;


        fuelLevel = fuelLevel - usedFuel;

        // same result as tuhe instruction above
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: + fuellevel ");

        return travelDistance;




    }

    public void decelerate (){
        // TODO: implement this
        System.out.println( " This is just a demo mathod");

    }
}
