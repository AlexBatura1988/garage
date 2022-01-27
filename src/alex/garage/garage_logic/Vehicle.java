package alex.garage.garage_logic;

import java.util.List;

public abstract class Vehicle {
    private String model;
    private final String licenseNumber;
    private  List<Wheel> wheelList;
    private Engine engine;

    public Vehicle(String model, String licenseNumber,
                   List<Wheel> wheelList, Engine engine) {
        this.model = model;
        this.licenseNumber = licenseNumber;
        this.wheelList = wheelList;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }


    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private void initializeWheels(String modelNameWheel, float currentAirPressure, float maxAirPressure){
        for (int i = 0; i < wheelList.size() ; i++) {
            wheelList.add(new Wheel(modelNameWheel, currentAirPressure, maxAirPressure));
        }
    }


    @Override
    public String toString() {
        return "Vehicle:" +" \n" +
               " model='" + model + "\n" +
               " licenseNumber='" + licenseNumber + "\n" +
               " wheelList=" + wheelList +"\n" +
               " engine=" + engine +"\n";

    }
}
