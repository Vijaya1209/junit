package com.assignments.testcases;

@RunWith(SpringJUnit4ClassRunner.class)
public class BankAccountTest {

	 @Test(expected = InsufficientBalanceException.class)
	    public void withdrawAmountGreaterThanBalance() throws InsufficientBalanceException {

	        BankAccount bankAcc = new BankAccount();
	        bankAcc.withdrawFunctionality(20000);
}
