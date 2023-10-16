package org.cec.multithreading.synchronization;

public class AccountThread implements Runnable {
	private Account acc;
    private int amt;
    
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}


	@Override
	public void run()
	{
		try {
			acc.withdraw(amt);
		} catch (InsufficientbalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
