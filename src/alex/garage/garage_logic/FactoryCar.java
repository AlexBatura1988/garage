package alex.garage.garage_logic;

import java.util.List;

public class FactoryCar {
    public static Car createCar(String model, String licenseNumber,List<Wheel> wheelList
                                , Engine engine, CarColor carColor, NumberOfDoors numberOfDoors){
        return new Car(model,licenseNumber,wheelList,engine,carColor,numberOfDoors);
    }
}
