package com.practice.interfacebasedprogramming;

public class KYCClient {
    public static void main(String[] args) {
        ConfirmUpload confirmUpload = new IDKYC("mk","rai");

        confirmUpload.showKYC("mk","rai");
    }
}
