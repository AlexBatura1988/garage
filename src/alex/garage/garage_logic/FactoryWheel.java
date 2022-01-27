package alex.garage.garage_logic;

public class FactoryWheel {
    public static Wheel createWheel(String manufactureName, float currentAirPressure, float maxAirPressure){
        return new Wheel(manufactureName, currentAirPressure, maxAirPressure);
    }
}
