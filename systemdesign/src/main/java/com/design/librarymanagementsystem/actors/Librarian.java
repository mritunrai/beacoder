package com.design.librarymanagementsystem.actors;

public class Librarian extends Account {
    @Override
    public boolean resetPassword() {
        return false;
    }

    @Override
    public boolean createPassword() {
        return false;
    }
//    public boolean addBook(BookItem bookIteam);
//
//
//    public boolean blockMember(Member member);
//
//    public boolean unBlockMember(Member member);


}
