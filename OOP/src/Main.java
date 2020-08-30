

public class Main {

	public static void main(String[] args) {
		  
//		Comanda comanda1=new ComandaMagazin(1,23,44,"Pitesti");
//		Comanda comanda2=new ComandaOnline(2,13,2);
//		Comanda comandaSimpla=new Comanda(3,4,2);
//		
//		comanda1.PlasareComanda();
//		comanda2.PlasareComanda();
//		comandaSimpla.PlasareComanda();
		
		System.out.println();
		
		Payment pay1=new PaymentCard(34,12,342);
		Payment pay2=new NoPaymentCard(23,2,"Romania");
		Payment pay3=new Payment(23,42);
		Payment payVisa=new Visa(23,12,323);
		Payment payPayPal=new PayPal(12,23,"Olanda");
		
		pay1.FinalizarePlata();
		pay2.FinalizarePlata();
		pay3.FinalizarePlata();
		payVisa.FinalizarePlata();
		payPayPal.FinalizarePlata();
	}

}
