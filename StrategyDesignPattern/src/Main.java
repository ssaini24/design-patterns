import vehicle.HatchBack;
import vehicle.SUV;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SUV();
        vehicle.drive();

        vehicle = new HatchBack();
        vehicle.drive();
    }
}