package com.practice.interfacebasedprogramming;

public class IDKYC implements ConfirmUpload{
    private String name;
    private String address;

    public IDKYC(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void showKYC(String name, String address)
    {
        System.out.println("Take value from different strings");
        System.out.println("Name "+name);
        System.out.println("Address "+address);
    }
}
