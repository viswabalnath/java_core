package main.java.designpattern.adapter;

public class PaypalAdapter implements PaymentProcessor {

	PaypalGateway gateway;
	
	public PaypalAdapter(PaypalGateway gateway) {
		this.gateway = gateway;
	}
	@Override
	public void pay(double amount) {

		gateway.makePayment(amount);
	}
	
	public static void main(String[] args) {
		PaypalAdapter adapter = new PaypalAdapter(new PaypalGateway());
		adapter.pay(4);
	}

}
