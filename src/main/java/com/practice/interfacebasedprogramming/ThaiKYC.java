package com.practice.interfacebasedprogramming;

public class ThaiKYC implements ConfirmUpload {
    private String name;
    private String address;

    public ThaiKYC(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void showKYC(String name, String address)
    {
        System.out.println("Name "+name);
        System.out.println("Address "+address);
    }
}
