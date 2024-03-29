package com.design.parkinglotmultiplefloor.actor;

import com.design.librarymanagementsystem.enumconstants.AccountStatus;
import com.design.librarymanagementsystem.enumconstants.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
}
