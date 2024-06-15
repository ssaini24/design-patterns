package vehicle;

import drivestrategy.DriveCapability;

public class Vehicle {

    DriveCapability driveCapability;

    public Vehicle(DriveCapability driveCapability){
        this.driveCapability = driveCapability;
    }

    public void drive(){
        this.driveCapability.drive();
    }
}
