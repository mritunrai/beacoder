package com.design.parkinglotmultiplefloor.parkingspot;

import com.design.parkinglot.Vehicle;
import com.design.parkinglotmultiplefloor.enumadnconstants.ParkingSpotType;

public class ParkingSpot {
    private final ParkingSpotType type;
    private Vehicle vehicle;
    private String number;

    private boolean free;

    public boolean IsFree() {
        return false;
    }

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
    }

    public boolean removeVehicle() {
        free = true;
    }
}
