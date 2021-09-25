package com.design.parkinglot;

import java.util.List;

public abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleSize;

    public abstract List<String> getVehicleInformation();
}
