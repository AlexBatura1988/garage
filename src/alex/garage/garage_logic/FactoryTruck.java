package alex.garage.garage_logic;

import java.util.List;

public class FactoryTruck {
    public static Truck createTruck(String model, String licenseNumber, List<Wheel> wheelList, Engine engine,
                                    float baggageCapacity, boolean hazardBaggage) {
        return new Truck(model, licenseNumber, wheelList, engine, baggageCapacity, hazardBaggage);

    }
}
