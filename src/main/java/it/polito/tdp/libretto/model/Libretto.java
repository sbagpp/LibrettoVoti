package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	
	private List <Voto> voti ; //ricorda che è in questo corso è meglio usare le da cui derivano.. ad esemipo in questo caso va benissimo usare una lista e più avvanti definiremo se sara una Linked o un Array...
	
	
	public Libretto () {
		this.voti = new ArrayList <Voto>();//ora scelgo la classe più specifica
	}
	
	
	public void add(Voto v) {
		this.voti.add(v);
	}


	@Override
	public String toString() {
		String rit="";
		for(Voto v : this.voti)
			rit+=v+"\n";
		return rit;	
	}
	
	

}
