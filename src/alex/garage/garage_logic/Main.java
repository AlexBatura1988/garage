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



        FactoryCar.createCar("mazda","123", list,new ElectricEngine(1.5f,3),
                CarColor.BLACK,NumberOfDoors.FIVE);




    }
}
