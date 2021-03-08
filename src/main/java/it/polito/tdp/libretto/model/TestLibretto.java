package it.polito.tdp.libretto.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main(String [] args) {
	
	System.out.println("Test Libretto");
	
	Libretto libretto = new Libretto() ;
	
	Voto voto1 = new Voto ("Analisi 1", 30, LocalDate.of(2019,2, 15));
	
	libretto.add(voto1);
	libretto.add(new Voto ("Fisica 1", 28, LocalDate.of(2019,7, 15)));
	libretto.add(new Voto ("informatica", 24, LocalDate.of(2019,9, 15)));
	libretto.add(new Voto ("Chimica", 25, LocalDate.of(2019,9, 15)));
	System.out.println(libretto);
	
	//modo 1:
	
	List <Voto> v25 = libretto.listaVotiUguali(25);
	for(Voto v : v25)
		System.out.println(v);
	
	//modo 2:
	
	Libretto l25 = libretto.librettoVotiuguali(25);
	System.out.println(l25);
	
	}
}
