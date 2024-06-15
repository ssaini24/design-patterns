package vehicle;

import drivestrategy.DriveCapability;
import drivestrategy.NormalDriveCapability;

public class HatchBack extends Vehicle {

    public HatchBack() {
        super(new NormalDriveCapability());
    }
}
