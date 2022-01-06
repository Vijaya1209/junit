package com.assignments.testcases;

public class BankAccount {

	int balance = 10000;

    public void withdrawFunctionality( int withdraw ) throws InsufficientBalanceException {

        if (withdraw > balance) {
            throw new InsufficientBalanceException(" Insufficient Balance ");
        }
        else
        {
            System.out.println(" Amount withdrawn :"+withdraw);
        }

    }

}
