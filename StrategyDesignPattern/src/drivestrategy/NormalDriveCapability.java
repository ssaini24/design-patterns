package drivestrategy;

public class NormalDriveCapability implements DriveCapability {
    @Override
    public void drive() {
        System.out.println("This is a normal capability");
    }
}
