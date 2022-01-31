package alex.garage.garage_logic;

import java.util.*;

public class GarageManage {
    private Map<String, GarageEntry> vehicles = new HashMap<>();
    private VehicleStatus vehicleStatus = VehicleStatus.PENDING;


    private void assertVehicleInGarage(String licenseNumber) {
        if (!vehicles.containsKey(licenseNumber)) {
            throw new IllegalArgumentException("Vehicle is not in garage");
        }
    }

    public void addVehicle(String holderName, String holderPhone, Vehicle vehicle) {
        GarageEntry entry;
        String msg = null;
        if (vehicles.containsKey(vehicle.getLicenseNumber())) {
            System.out.println("vehicle already in garage");
        } else {
            entry = new GarageEntry(holderName, holderPhone, vehicle);
            entry.setVehicleStatus(VehicleStatus.PENDING);
            vehicles.put(vehicle.getLicenseNumber(), entry);
        }
    }

    public void setVehicleStatus(String licenseNumber, VehicleStatus vehicleStatus) {

        assertVehicleInGarage(licenseNumber);
        vehicles.get(licenseNumber).setVehicleStatus(vehicleStatus);
    }

    public void fillWheelAir(String licenseNumber) {
        assertVehicleInGarage(licenseNumber);
        for (Wheel wheel : vehicles.get(licenseNumber).getVehicle().getWheelList()) {
            wheel.inflateWheel(wheel.missingAirPressure());
        }

    }

    public void fillEnergyVehicle(String licenseNumber, float energy) {
        assertVehicleInGarage(licenseNumber);
        vehicles.get(licenseNumber).getVehicle().getEngine().addEnergy(energy);
    }

    public String getEntryText(String licenseNumber) {
        assertVehicleInGarage(licenseNumber);
        return "vehicle in garage: " + vehicles.get(licenseNumber);
    }

    public List<String> filterCars(VehicleStatus vehicleStatus) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, GarageEntry> entry : vehicles.entrySet()) {
            if (vehicleStatus.equals(entry.getValue().getVehicleStatus())) {
                list.add(entry.getValue().getVehicle().getLicenseNumber());
            }
        }
        return list;
    }
    @Override
    public String toString() {
        return
                "vehicles in garage = " + vehicles;
    }
}
