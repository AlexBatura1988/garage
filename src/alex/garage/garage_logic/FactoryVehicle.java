package alex.garage.garage_logic;

import java.util.List;

public class FactoryVehicle {

    public static Truck createTruck(String model, String licenseNumber, List<Wheel> wheelList, Engine engine,
                                    float baggageCapacity, boolean hazardBaggage) {
        return new Truck(model, licenseNumber, wheelList, engine, baggageCapacity, hazardBaggage);
    }

    public static Car createCar(String model, String licenseNumber, List<Wheel> wheelList
            , Engine engine, CarColor carColor, NumberOfDoors numberOfDoors) {
        return new Car(model, licenseNumber, wheelList, engine, carColor, numberOfDoors);
    }

    public static Motorcycle createMotorcycle(String model, String licenseNumber, List<Wheel> wheelList,
                                              Engine engine, LicenseType licenseType, int engineCapacity) {
        return new Motorcycle(model, licenseNumber, wheelList, engine, licenseType, engineCapacity);

    }


}
