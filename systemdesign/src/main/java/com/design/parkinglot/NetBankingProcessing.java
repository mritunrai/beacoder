package com.design.parkinglot;

import java.util.HashMap;

public class NetBankingProcessing implements IPayment {
    private String userName;
    private String password;

    private HashMap<String, String> netBankingRepo;

    public NetBankingProcessing(String userName, String password) {
        this.userName = userName;
        this.password = password;
        netBankingRepo = new HashMap<>();
        netBankingRepo.put("mk", "pwd");
    }

    public boolean isValidUser() {
        if (!netBankingRepo.get(userName).isEmpty())
            return true;
        else
            return false;
    }

    @Override
    public boolean calculateAmount(double amount) {

        if (isValidUser())
            return true;
        else
            return false;
    }
}