package shpStackController;

public class CreditCard  implements InventorySystem{
private String name;
private String cardNumber;

public CreditCard(String name, String cardNumber) {

	this.name = name;
	this.cardNumber = cardNumber;
}

	@Override
	public void makePayment(int amount) {
		System.out.println(amount + "paid with Card");
	}

}
 