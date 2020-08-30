
public class PaymentCard extends Payment{

	int cvc;
	
	public PaymentCard(int balance, int pay,int cvc) {
		super(balance, pay);
		this.cvc=cvc;
	}
		

}
