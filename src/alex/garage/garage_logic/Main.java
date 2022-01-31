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

        GarageManage garageManage = new GarageManage();
        List<String> vehicleList = new ArrayList<>();


        Vehicle truck = new Truck("Volvo", "128", list, new FuelEngine(20f, 40f, FuelType.SOLAR),
                500f, false);


        Vehicle motorcycle = new Motorcycle("ij planeta", "256", list, new ElectricEngine(1.2f,
                2.5f), LicenseType.A1, 990);

        garageManage.addVehicle("alex", "0555", motorcycle);
        garageManage.addVehicle("roma", "0546987", truck);

        garageManage.fillWheelAir("256");
        garageManage.fillEnergyVehicle("256", 0.8f);
        vehicleList = (garageManage.filterCars(VehicleStatus.PENDING));
        System.out.println(vehicleList);
        garageManage.setVehicleStatus("128", VehicleStatus.PAID);
        vehicleList = garageManage.filterCars(VehicleStatus.PAID);
        System.out.println(vehicleList);


    }
}
