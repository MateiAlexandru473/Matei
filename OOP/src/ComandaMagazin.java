
public class ComandaMagazin extends Comanda {

	String oras;
	
	public ComandaMagazin(int id, int pret, int cantitate,String oras) {
		super(id, pret, cantitate);
        this.oras=oras;
       
	}
		   
   @Override
	 public void PlasareComanda() {
	   System.out.println("Comanda cu id-ul "+this.id+" a fost plasata in orasul: "+this.oras+", avand costul total: "+ValoareComanda()+" lei.");
	}

	public String getOras() {
	    return oras;
    }

    public void setOras(String oras) {
	    this.oras = oras;
    }

	public int ValoareComanda() {
		 return this.pret * this.cantitate;
	}


	
}
