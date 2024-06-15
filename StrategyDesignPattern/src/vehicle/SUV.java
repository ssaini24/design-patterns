package vehicle;

import drivestrategy.SpecialDriveCapability;

public class SUV extends Vehicle {

    public SUV(){
        super(new SpecialDriveCapability());
    }
}
