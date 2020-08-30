package server;

import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) {
		
		try(ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            
            int recivedComand;
            ProcesareComenzi comenzi=new ProcesareComenzi();
            
            while(true) {
            	recivedComand = Integer.parseInt(input.readLine());
            	
                if(recivedComand == 4) {               	
                	System.out.println("Conexiune incheiat");
               	    output.println("Conexiune incheiata");
               	    break;
                }
                
                switch(recivedComand) {                                  
                   case 1:  
                	  output.println("Suma totala aferenta tuturor comenzilor este: "+comenzi.SumaTotala()); 
                      break;                    
                   case 2:  
                	  output.println("Comanda cea mai valoroasa are ID ul : "+comenzi.ComandaCeaMaiValoroasa()); 
                	  break;
                   case 3:  
                	  output.println("Comanda cu cel mai mic pret are ID ul : "+comenzi.ComandaCuCelMaiMicPret()); 
                	  break;                     
                   default: 
                	  output.println("Tasta gresita,incercati din nou"); 
                }          
            }
            
        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
	}

}
