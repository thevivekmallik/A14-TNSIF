package org.cec.multithreading.synchronization;

public class InsufficientbalanceException extends Exception {

	public InsufficientbalanceException()
	{
		super("Insufficient balance in your account");
	}
	public InsufficientbalanceException(String message)
	{
		super(message);
	}
}
