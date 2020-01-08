package shopStackModel;

	public class Inventory {
		private int price;
		private int numOfProduct;
		private String upcCode; 
		private int expireDate;
		
		

		public Inventory(int price, int numOfProduct, String upcCode, int expireDate) {
			this.price = price;
			this.numOfProduct = numOfProduct;
			this.upcCode = upcCode;
			this.expireDate = expireDate;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getNumOfProduct() {
			return numOfProduct;
		}
		public void setNumOfProduct(int numOfProduct) {
			this.numOfProduct = numOfProduct;
		}
		public String getUpcCode() {
			return upcCode;
		}
		public void setUpcCode(String upcCode) {
			this.upcCode = upcCode;
		}
		public int getExpireDate() {
			return expireDate;
		}

		public void setExpireDate(int expireDate) {
			this.expireDate = expireDate;
		}
		public void checkExpiredate() {
			
		}

	
		
	}
