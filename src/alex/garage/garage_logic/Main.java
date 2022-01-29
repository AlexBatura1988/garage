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



        Vehicle truck = new Truck("Volvo","128",list,new FuelEngine(20f,40f,FuelType.SOLAR),
                500f,false);
        System.out.println(truck);

        Vehicle motorcycle = new Motorcycle("ij planeta","887",list,new ElectricEngine(1.2f,
                2.5f),LicenseType.A1,990);
        System.out.println(motorcycle);




    }
}
