package shpStackController;

public class Paypal implements InventorySystem {
	private String email;
	private String password;
	
	public Paypal(String email, String password) {
		this.email = email;
		this.password = password;
		
	}
	
	@Override
	public void makePayment(int amount) {
		System.out.println( "paid with Paypal: " + amount);
	}

}
