package alex.garage.garage_logic;

import alex.garage.VehicleStatus;

public class OwnerDetails {
    private String ownerName;
    private String ownerNumber;
    private VehicleStatus vehicleStatus = VehicleStatus.InPROCESS;

    public OwnerDetails(String ownerName, String ownerNumber) {
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
