package server;

public class Comanda {
	
	private int ID;
	private double pret;
	private int cantitate;
	
	public Comanda(int ID,double pret,int cantitate) {
		this.ID=ID;
		this.pret=pret;
		this.cantitate=cantitate;
	}
	
	public double Valoare() {
		return this.pret*this.cantitate;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public int getCantitate() {
		return cantitate;
	}
	
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "Comanda [ID=" + ID + ", pret=" + pret + ", cantitate=" + cantitate + "]";
	}
}
