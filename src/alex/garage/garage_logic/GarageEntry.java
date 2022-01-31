package alex.garage.garage_logic;

public class GarageEntry {
    private String name;
    private String phone;
    private Vehicle vehicle;
    private VehicleStatus vehicleStatus = VehicleStatus.PENDING;

    public GarageEntry(String name, String phone, Vehicle vehicle) {
        this.name = name;
        this.phone = phone;
        this.vehicle = vehicle;

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    @Override
    public String toString() {
        return
               "name= " + name   +
               ", phone= " + phone +
               ", vehicle= " + vehicle +
               ", vehicleStatus= " + vehicleStatus;

    }
}
