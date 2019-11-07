package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {

	public static void main(String[] args){
		Entreprise.primeAnnuelleBase();
		
		Commercial monEmploye = new Commercial("gilbert", "becaud", "012354", LocalDate.now(), 50000d, 50000d, 50 );
		//monEmploye.setCaAnnuel(0d);
		
		System.out.println(monEmploye.getPrimeAnnuelle());
		System.out.println(monEmploye.getNom());
	
	}

}
