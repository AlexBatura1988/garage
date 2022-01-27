package alex.garage.garage_logic;

public abstract class Engine {

    private float currentCapacity;
    private float maxEnergyCapacity;

    public float getCurrentCapacity() {
        return currentCapacity;
    }

    public float getMaxEnergyCapacity() {
        return maxEnergyCapacity;
    }

    public void setCurrentCapacity(float currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setMaxEnergyCapacity(float maxEnergyCapacity) {
        this.maxEnergyCapacity = maxEnergyCapacity;
    }

    public Engine(float currentCapacity, float maxEnergyCapacity) {
        this.currentCapacity = currentCapacity;
        this.maxEnergyCapacity = maxEnergyCapacity;
    }

    public abstract void addEnergy(float energyToAdd);

    public abstract void fillMaxEnergy();

    @Override
    public String toString() {
        return
                "currentCapacity=" + currentCapacity +
                ", maxEnergyCapacity=" + maxEnergyCapacity;
    }
}
