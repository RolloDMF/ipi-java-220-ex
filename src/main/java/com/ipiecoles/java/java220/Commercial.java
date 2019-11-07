package com.ipiecoles.java.java220;

import java.lang.reflect.Constructor;
import java.util.Objects;

import org.joda.time.LocalDate;

public class Commercial extends Employe {
	
	private Double caAnnuel;
	private Integer performance;

	public Commercial() {
		
	}
	
	public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		setCaAnnuel(caAnnuel);
		setPerformance(performance);
		
	}
	
	public Integer getPerformance() {
		return performance;
	}

	public void setPerformance(Integer performance) {
		this.performance = performance;
	}

	public Boolean performanceEgale(Integer perf) {
		if (perf.equals(this.performance)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Double getPrimeAnnuelle() {
		
		Double primeAnuel = this.caAnnuel * 0.05;
		
		if (primeAnuel <= 500.0 || primeAnuel == null) {
			primeAnuel = 500.0;
		}
		
		return (double) Math.ceil(primeAnuel);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire, caAnnuel, performance);
	}
	
	public String equivalenceNote() {
		return "a faire plus tard";
	}

	public Double getCaAnnuel() {
		return caAnnuel;
	}

	public void setCaAnnuel(Double caAnnuel) {
		this.caAnnuel = caAnnuel;
	}
	
	

}
