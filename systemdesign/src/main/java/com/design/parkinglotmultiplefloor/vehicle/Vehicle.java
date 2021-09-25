package com.design.parkinglotmultiplefloor.vehicle;

import com.design.parkinglot.ParkingTicket;
import com.design.parkinglot.VehicleType;

public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.parkingTicket = ticket;
    }
}
