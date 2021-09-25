package com.design.parkinglot;

import java.util.HashMap;

public class CreditCardProcessor implements IPayment {

    private String cardNo;

    private HashMap<String, HashMap<String, String>> creditCardRepositary = new HashMap<>();

    public CreditCardProcessor(String cardNo) {
        this.cardNo = cardNo;
        creditCardRepositary.put("1234", new HashMap() {{
            put("mk", "02/21");
        }});

        creditCardRepositary.put("4567", new HashMap() {{
            put("annu", "02/23");
        }});
    }

    public boolean isValidCard(String cardNo) {
        if (!creditCardRepositary.get(cardNo).isEmpty())
            return true;
        else
            return false;
    }

    @Override
    public boolean calculateAmount(double amount) {

        if (isValidCard(cardNo))
            return true;
        else
            return false;
    }
}
