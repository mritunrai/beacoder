package com.design.librarymanagementsystem.actors;

import com.design.librarymanagementsystem.enumconstants.AccountStatus;
import com.design.librarymanagementsystem.enumconstants.Person;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public abstract boolean resetPassword();
    public abstract boolean createPassword();
}
