
public class Payment {

	int balance;
	int pay;
	
	public Payment(int sold,int pay) {
		this.balance=sold;
		this.pay=pay;
	}
	
	public void FinalizarePlata()
	{
		int checkSold=this.balance- this.pay;
		
		if(checkSold<= 0) {
			System.out.println("Sold insuficient.");
		}
		else {
			System.out.println("Plata a fost finalizata cu succes");
		}
			
	}
	
	public void loadBalance(int loadBalance) {
    	this.balance += loadBalance;
    }
	
	
}
