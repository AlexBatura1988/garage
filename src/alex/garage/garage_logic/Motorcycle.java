package alex.garage.garage_logic;
import java.util.List;

public class Motorcycle extends Vehicle {
    private final int numberOfWheels = 2;
    private final float airMax = 33;
    private final float maxBatteryTime = 1.4f;
    private final float maxFuelTank = 8;
    private LicenseType licenseType;
    private int engineCapacity;

    public Motorcycle(String model, String licenseNumber, List<Wheel> wheelList, Engine engine,
                      LicenseType licenseType, int engineCapacity) {
        super(model, licenseNumber, wheelList, engine);
        this.licenseType = licenseType;
        this.engineCapacity = engineCapacity;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public float getAirMax() {
        return airMax;
    }

    public float getMaxBatteryTime() {
        return maxBatteryTime;
    }

    public float getMaxFuelTank() {
        return maxFuelTank;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return  super.toString() + "license type: " + licenseType +"\n" +
                "Engine capacity: " + engineCapacity;
    }
}
