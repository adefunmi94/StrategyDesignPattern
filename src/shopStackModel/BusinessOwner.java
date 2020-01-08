package shopStackModel;



public class BusinessOwner {
	private String firstNAme;
	private String lastNmae;
	private String email;
	private int phone;

	
	public BusinessOwner(String firstNAme, String lastNmae, String email, int phone) {
		this.firstNAme = firstNAme;
		this.lastNmae = lastNmae;
		this.email = email;
		this.phone = phone;
		
	}
	
	public String getFirstNAme() {
		return firstNAme;
		
	}
	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
