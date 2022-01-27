package alex.garage.garage_logic;

public class Wheel {
    private String manufactureName;
    private float currentAirPressure;
    private final   float maxAirPressure;

    public Wheel(String manufactureName, float currentAirPressure, float maxAirPressure) {
        this.manufactureName = manufactureName;
        this.currentAirPressure = currentAirPressure;
        this.maxAirPressure = maxAirPressure;
    }


    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public float getCurrentAirPressure() {
        return currentAirPressure;
    }

    public float getMaxAirPressure() {
        return maxAirPressure;
    }

    public void inflateWheel(float airPressureToAdd){
       if(currentAirPressure + airPressureToAdd <= maxAirPressure){
           currentAirPressure += airPressureToAdd;
       }else {
           throw new IllegalArgumentException("air pressure to add not valid");
       }
    }
    public float missingAirPressure(){
        return maxAirPressure - currentAirPressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
               "modelNameWheel='" + manufactureName + '\'' +
               ", currentAirPressure=" + currentAirPressure +
               ", maxAirPressure=" + maxAirPressure +
               '}';
    }
}
