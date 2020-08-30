package server;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class ProcesareComenzi {
    
    Set<Comanda> comenzi;
	
    public ProcesareComenzi() {
    	
    	this.comenzi=new LinkedHashSet<Comanda>();
		try ( Scanner scaner=new Scanner(new FileReader("D:\\Practica-WorkSpace\\Collections\\src\\text2.txt"))){	   	
			
			while(scaner.hasNextLine()) {   
			 String line=scaner.nextLine();
		     String[] arrayParameters=line.split(" ");	
		     int ID=Integer.parseInt(arrayParameters[0]);
			 double pret=Double.parseDouble(arrayParameters[1]);
			 int cantitate=Integer.parseInt(arrayParameters[2]); 
		    		 
			 Comanda comanda=new Comanda(ID,pret,cantitate);
			 comenzi.add(comanda); 
		   }
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    public double SumaTotala() {
    	
    	double suma=0;  	
        for(Comanda comanda:comenzi)
        	suma+=comanda.getPret()*comanda.getCantitate();
        
        return suma;
    }
    
    public int ComandaCeaMaiValoroasa() {
    	
    	 Comanda comanda=comenzi.stream()
                                .max(Comparator.comparing(Comanda::Valoare))
                                .orElseThrow(NoSuchElementException::new);
    	 
    	 return comanda.getID();
    }
    
    public int ComandaCuCelMaiMicPret() {
    	
         Comanda comanda=comenzi.stream()
    	                        .min(Comparator.comparing(Comanda::getPret))
                                .orElseThrow(NoSuchElementException::new);
         
         return comanda.getID();
    }
    
}
