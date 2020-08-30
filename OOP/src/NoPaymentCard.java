
public class NoPaymentCard extends Payment {

	String country;
	
	public NoPaymentCard(int balance, int pay,String country) {
		super(balance, pay);
		this.country=country;
	}
	
    
	

}
