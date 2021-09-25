package com.design.parkinglotmultiplefloor;

import com.design.parkinglot.ParkingTicketStatus;

import java.util.Date;

public class ParkingTicket {
    private String ticketNumber;
    private Date issueAT;
    private Date payedAt;
    private double payedAmount;
    private ParkingTicketStatus parkingTicketStatus;
}