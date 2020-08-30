import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Procesare {
    
	Set<Comanda> comenzi;
	
    public Procesare(Set<Comanda>comenzi) {
    	this.comenzi=comenzi;
    }
    
    public void SumaTotala() {
    	
    	double suma=0;  	
        for(Comanda comanda:comenzi)
        	suma+=comanda.getPret()*comanda.getCantitate();
        
        System.out.println("1.Suma totala aferenta tuturor comenzilor este: "+suma);
        System.out.println();
    }
    
    public void ComandaCeaMaiValoroasa() {
    	
    	 Comanda comanda=comenzi.stream()
                                .max(Comparator.comparing(Comanda::Valoare))
                                .orElseThrow(NoSuchElementException::new);
    	 
    	 System.out.println("2.ID ul cu cea mai mare valoare este : "+comanda.getID());
         System.out.println();
    }
    
    public void ComandaCuCelMaiMicPret() {
    	
         Comanda comanda=comenzi.stream()
    	                        .min(Comparator.comparing(Comanda::getPret))
                                .orElseThrow(NoSuchElementException::new);
         
         System.out.println("3.ID ul cu cel mai mic pret este : "+comanda.getID());
         System.out.println();
    }
}
