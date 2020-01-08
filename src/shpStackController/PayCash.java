package shpStackController;

public class PayCash implements InventorySystem {
	private int moneyHand;
	public PayCash(int moneyHand) {
		this.moneyHand = moneyHand;
	}
	@Override
	public void makePayment(int amount) {
		int bal = 0;
	 if(moneyHand > amount) {
	  bal = moneyHand - amount ;
		 System.out.println("You paid with cash and your balance is: " + bal);
	 }
	 else {
		 System.out.println("paid with cash: " + amount);
	 }
		
	}

}
