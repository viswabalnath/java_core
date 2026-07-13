package main.java.designpattern.adapter;

public class PaypalGateway {

	public void makePayment(double amount) {
		System.out.println("payment via paypal: " + amount);
	}
}
