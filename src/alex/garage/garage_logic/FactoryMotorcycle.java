package alex.garage.garage_logic;
import java.util.List;

public class FactoryMotorcycle {
    public static Motorcycle createMotorcycle(String model, String licenseNumber, List<Wheel> wheelList,
                                              Engine engine, LicenseType licenseType, int engineCapacity) {
        return new Motorcycle(model, licenseNumber, wheelList, engine, licenseType, engineCapacity);


    }
}
