package com.design.parkinglot;

public class CashPayment implements IPayment{
    @Override
    public boolean calculateAmount(double amount) {
        return true;
    }
}
