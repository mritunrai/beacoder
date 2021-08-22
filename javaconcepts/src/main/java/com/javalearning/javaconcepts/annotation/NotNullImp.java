package com.javalearning.javaconcepts.annotation;

public class NotNullImp {

    @NotNull
    public void showEmp()
    {
        System.out.println("Show EMp method");
    }

    public static void main(String[] args) {
        NullProcessor nullProcessor = new NullProcessor();

        NotNullImp notNullImp = new NotNullImp();
        notNullImp.showEmp();
    }
}
