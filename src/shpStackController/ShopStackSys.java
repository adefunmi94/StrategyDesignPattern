package shpStackController;

import java.util.ArrayList;
import java.util.List;

import shopStackModel.BusinessOwner;
import shopStackModel.Inventory;

public class ShopStackSys {
	List<BusinessOwner>ownerList;
	List<Inventory>inventList;
	
	 public  ShopStackSys() {
		 	this.ownerList = new ArrayList<>();
		 	this.inventList = new ArrayList<>();
	 }
	 public void addBusinesOwner(BusinessOwner owner, Inventory invent) {
		ownerList.add(owner);
		inventList.add(invent);
	 }
	 public void removeBusinesOwner(BusinessOwner owner, Inventory invent) {
			ownerList.remove(owner);
			inventList.remove(invent);
	
			}
	public int calculatePrice() {
		int total = 0;
		for(Inventory inventy: inventList) {
			total += inventy.getPrice();
		}
		return total;
	}
	public void getNumberOfInventory() {
		int availableInv = 0;
		int leastInve = 5;
		for(Inventory inventy: inventList) {
			availableInv += inventy.getNumOfProduct();
			 
		}
			
			if(availableInv < leastInve ) {
				System.out.println("Your Inventory is Low, please Stack up!! You have Just: " + leastInve);
			}
			else {
				System.out.println("Yeppii!! you have Stock! " + availableInv);
			}
		
		}   

	public void pay(InventorySystem makepaymentChoice) {
		int amount = calculatePrice();
		makepaymentChoice.makePayment(amount);
	}
}
		