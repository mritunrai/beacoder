package com.design.parkinglot;

import java.util.HashMap;

public class ParkingLot {
    private PARKINGSIZE parkingsize;
    private HashMap<PARKINGSIZE, Integer> availableSlot = new HashMap<>();
    IPayment payment;

    public ParkingLot()
    {
        availableSlot.put(PARKINGSIZE.SMALL, 10);
        availableSlot.put(PARKINGSIZE.MEDIUM, 10);
        availableSlot.put(PARKINGSIZE.LARGE, 10);
    }


    public void parkVehicle() {


    }

    public void exitVehicle(PARKINGSIZE parkingsize) {

        availableSlot.put(parkingsize,availableSlot.get(parkingsize)+1);
    }

    public boolean isSlotAvailable(PARKINGSIZE parkingsize) {
        if (availableSlot.get(parkingsize) > 0)
            return true;
        else
            return false;
    }

    public double payTicket(IPayment payment)
    {



    }
}
