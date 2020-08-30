import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cerinta1 {

	public static void main(String[] args) throws Exception {
		
		List<String> text=new LinkedList<String>();
		
		try ( Scanner scaner=new Scanner(new FileReader("D:\\Practica-WorkSpace\\Collections\\src\\text1.txt"))){	   	
			
			while(scaner.hasNextLine()) {  
			 String line=scaner.nextLine();
		     for(String s: line.split(" "))
		     text.add(s);
		   }
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Cuvintele din fisier sunt: ");
		text.forEach(s-> System.out.print(s+" "));
		System.out.println();
		
		System.out.println("1.Numarul de cuvinte din fisier este: ");
        System.out.print(text.size());
        System.out.println();
        
        System.out.println("2.Frecventa de aparitie a fiecarui cuvant este: ");
           text.stream()
               .distinct()
               .forEach(s -> System.out.println(s+": "+Collections.frequency(text, s)+" "));
        System.out.println();
        
        System.out.println("3.Cuvintele disctincte din fisier sunt: ");
           text.stream()
               .distinct()
               .forEach(s -> System.out.print(s+" "));
        System.out.println();
        
        System.out.println("4.Cuvintele care incep cu o litera specificata: ");
           text.stream()
               .filter(s-> s.startsWith("A"))
               .forEach(System.out::println);

	
}
}
