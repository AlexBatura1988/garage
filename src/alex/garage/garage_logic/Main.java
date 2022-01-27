package alex.garage.garage_logic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Wheel> list = new ArrayList<>();
        list.add(FactoryWheel.createWheel("m", 15f, 21f));
        list.add(FactoryWheel.createWheel("l", 16f, 22f));
        list.add(FactoryWheel.createWheel("d", 11f, 20f));
        list.add(FactoryWheel.createWheel("z", 14f, 29f));

        Vehicle car = new Car("Mazda", "25674", list,
                new FuelEngine(30, 60, FuelType.OCTANE98), CarColor.BLUE, NumberOfDoors.TWO);

        System.out.println(car);
        car.getEngine().fillMaxEnergy();

        System.out.println(car);

        Vehicle car1 = new Car("tesla", "12345", list,
                new ElectricEngine(1.5f, 1.9f), CarColor.BLACK, NumberOfDoors.THREE);
        System.out.println(car1);


    }
}
