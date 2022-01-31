package alex.garage.garage_logic;

public class FuelEngine extends Engine {
    private final FuelType fuelType;

    public FuelEngine(float currentCapacity, float maxEnergyCapacity, FuelType fuelType) {
        super(currentCapacity, maxEnergyCapacity);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void addEnergy(float energyToAdd) {
        float currentEnergy = getCurrentCapacity();
        if (currentEnergy + energyToAdd <= getMaxEnergyCapacity()) {
            currentEnergy += energyToAdd;
            setCurrentCapacity(currentEnergy);
        } else {
            throw new IllegalArgumentException("energy to add not valid");
        }

    }

    @Override
    public void fillMaxEnergy() {
        float maxEnergy = getMaxEnergyCapacity();
        setCurrentCapacity(maxEnergy);
    }


    public String toString() {
        return " current fuel tank = (" + super.toString() +
               ") " + ", fuel engine," + " fuel type = " + fuelType;
    }
}
