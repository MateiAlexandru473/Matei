
public class ComandaOnline extends Comanda {


	public ComandaOnline(int id, int pret, int cantitate) {
		super(id, pret, cantitate);		
	}

	@Override
	public void PlasareComanda() {
		System.out.println("Comanda cu id-ul "+this.id+" a fost plasata,avand costul total: "+ValoareComanda()+" lei.");
	}
	
	
	

}
