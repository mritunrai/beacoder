package com.design.parkinglotmultiplefloor.actor;

import com.design.parkinglotmultiplefloor.ParkingFloor;
import com.design.parkinglotmultiplefloor.parkingspot.ParkingSpot;

public class Admin extends Account {
    private String floorName;
    private ParkingSpot spot;

    public boolean addParkingFloor(ParkingFloor floor) {
        return true;
    }

    public boolean addParkingSpot(String floorName, ParkingSpot spot) {
        this.floorName = floorName;
        this.spot = spot;
        return true;
    }

    public boolean addParkingDisplayBoard(String floorName, ParkingDisplayBoard displayBoard) {
        return true;
    }

    public boolean addCustomerInfoPanel(String floorName, CustomerInfoPanel infoPanel) {
        return true;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel) {
        return true;
    }

    public boolean addExitPanel(ExitPanel exitPanel) {
        return true;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}

