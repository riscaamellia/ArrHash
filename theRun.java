package Project;

import java.util.HashMap;
import java.util.Scanner;

public class theRun {
	public static void main(String[] args) {
		Lokasi L = new Lokasi();
		HashMap<String, Lokasi> con = new HashMap<>();
		
	        con.put("Wagiran", new Lokasi("Wagiran", "Laki-laki", "Malang", "Karangploso", "Tegalgondo", "11"));
	        con.put("Paniran", new Lokasi("Paniran", "Laki-laki", "Malang", "Karangploso", "Tegalgondo", "9"));
	        con.put("Sri", new Lokasi("Sri", "Perempuan", "Malang", "Karangploso", "Tegalgondo", "6"));
	        con.put("Sri", new Lokasi("Sri", "Perempuan", "Malang", "Karangploso", "Tegalgondo", "6"));
	        
	        
	      
	        con.forEach((k,v) -> System.out.println("key: "+k+" - "+v.getNama()+" --> "+v.getJenisKelamin()+" --> "+v.getKota()+" --> "+v.getKec()+" --> "+v.getDesa()+" --> "+v.getRT()));
		

	        Scanner scan = new Scanner(System.in);  
	        System.out.println("Masukkan nama : ");  
	        //String value = L.get();  
	        //System.out.println("Data" + value); 
	        }
	
}
