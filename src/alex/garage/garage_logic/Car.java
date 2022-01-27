package alex.garage.garage_logic;


import java.util.List;

public class Car extends Vehicle {
    private final int numberOfWheels = 4;
    private final float airMax = 31f;
    private final float maxBatteryTime = 1.8f;
    private final float maxFuelTank = 55f;
    private CarColor carColor;
    private NumberOfDoors numberOfDoors;

    public Car(String model, String licenseNumber,
               List<Wheel> wheelList, Engine engine, CarColor carColor, NumberOfDoors numberOfDoors) {
        super(model, licenseNumber, wheelList, engine);
        this.carColor = carColor;
        this.numberOfDoors = numberOfDoors;
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


    public CarColor getCarColor() {
        return carColor;
    }

    public NumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }



    @Override
    public String toString() {
        return super.toString() + " car color: " + carColor + "\n" + " number of doors " + numberOfDoors;
    }
}
