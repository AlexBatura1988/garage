package alex.garage.garage_logic;

public class ElectricEngine extends Engine {

    public ElectricEngine(float currentCapacity, float maxEnergyCapacity) {
        super(currentCapacity, maxEnergyCapacity);
    }

    @Override
    public void addEnergy(float energyToAdd) {
        float currentBattery = getCurrentCapacity();
        if (currentBattery + energyToAdd <= getMaxEnergyCapacity()) {
            currentBattery += energyToAdd;
            setCurrentCapacity(currentBattery);
        } else {
            throw new IllegalArgumentException("invalid energy to add");
        }

    }

    @Override
    public void fillMaxEnergy() {
        float maxBattery = getMaxEnergyCapacity();
        setCurrentCapacity(maxBattery);
    }

    public String toString() {
        return " current battery = (" + super.toString() +
               ") " + ", electric engine";
    }
}
