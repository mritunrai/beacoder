package com.design.parkinglot;

public class WalletPay implements IPayment {

    @Override
    public boolean calculateAmount(double amount) {
        return true;
    }
}
