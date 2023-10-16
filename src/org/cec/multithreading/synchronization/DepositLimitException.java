package org.cec.multithreading.synchronization;

public class DepositLimitException extends Exception {

	public DepositLimitException() {
		super("Daily limit of deposit is eceeded");
	}
	public DepositLimitException(String message) {
		super(message);
}
}