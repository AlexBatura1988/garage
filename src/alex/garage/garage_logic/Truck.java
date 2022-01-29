package alex.garage.garage_logic;

import java.util.List;

public class Truck extends Vehicle {
    private final int numberOfWheels = 12;
    private final float airMax = 26;
    private final float maxFuelTank = 110;
    private float baggageCapacity;
    private boolean hazardBaggage;

    public Truck(String model, String licenseNumber, List<Wheel> wheelList, Engine engine,
                 float baggageCapacity, boolean hazardBaggage) {
        super(model, licenseNumber, wheelList, engine);
        this.baggageCapacity = baggageCapacity;
        this.hazardBaggage = hazardBaggage;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public float getAirMax() {
        return airMax;
    }

    public float getMaxFuelTank() {
        return maxFuelTank;
    }

    public float getBaggageCapacity() {
        return baggageCapacity;
    }

    public boolean isHazardBaggage() {
        return hazardBaggage;
    }

    @Override
    public String toString() {
        return  super.toString() +" Baggage capacity: " + baggageCapacity +"\n "+
                "Hazard baggage: " +hazardBaggage;
    }
}
