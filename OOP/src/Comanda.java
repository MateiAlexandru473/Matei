
public  class Comanda {
	
   public int id;
   public int pret;
   public int cantitate;
     
   public Comanda(int id, int pret, int cantitate) {
	   this.id=id;
	   this.pret=pret;
	   this.cantitate=cantitate;
	   
   }
     
   public void PlasareComanda() {
	   System.out.println("Comanda cu id-ul "+id+" a fost plasata,avand costul total: "+ValoareComanda()+" lei.");
   }
   
   public int ValoareComanda() {
	   return this.pret*this.cantitate;
   }
   
   public int getNumeProdus() {
	  return id;
   }
   
   public void setNumeProdus(int id) {
	  this.id = id;
   }
   
   public int getPret() {
	  return pret;
   }
   
   public void setPret(int pret) {
 	  this.pret = pret;
   }
   
   public int getCantitate() {
	  return cantitate;
   }
   
   public void setCantitate(int cantitate) {
	  this.cantitate = cantitate;
   }
   
   
}
