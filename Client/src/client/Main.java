package client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader responses = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter toSend= new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            int sendComand;
            String response;
            
            System.out.println("Tastati un numar intre 1-4 pentru urmatoare facilitatii:\n"
 		           + "1 - Pentru afisarea sumei totale aferenta tuturor comenzilor.\n"
 		           + "2 - Pentru afisarea ID-ului comenzi cu cea mai mare valoare.\n"
 		           + "3 - Pentru afisarea ID-ului comenzi cu cel mai mic pret.\n"
 		           + "4 - Pentru inchiderea conexiuni.");
          
            do {
                sendComand = scanner.nextInt();
                toSend.println(sendComand); 
                
                response = responses.readLine();
                System.out.println(response);
                                        
            } while(!(sendComand == 4));

        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());

        }
	}

}
