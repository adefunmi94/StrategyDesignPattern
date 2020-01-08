package mainPackage;

import shopStackModel.BusinessOwner;
import shopStackModel.Inventory;
import shpStackController.PayCash;
import shpStackController.Paypal;
import shpStackController.ShopStackSys;

public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopStackSys product = new ShopStackSys();
		Inventory biscuit = new Inventory (8000, 4,"192039348", 20112019);
		Inventory bra = new Inventory (3000, 59,"1920393658", 20112019);
		Inventory shoes = new Inventory (5000, 56,"53763948", 20112020);
		
		BusinessOwner adeVenture = new BusinessOwner("adeola","abimobola","oyeyopo@gmail.com",05234);


	
	product.addBusinesOwner(adeVenture, shoes);
	product.removeBusinesOwner(adeVenture, bra);
	product.addBusinesOwner(adeVenture, biscuit);
	
	product.getNumberOfInventory(); 
	product.pay(new PayCash(50000));
	product.pay(new Paypal("oyeyipoadefunmi@gmail.com","adefunmi"));

	}

}
