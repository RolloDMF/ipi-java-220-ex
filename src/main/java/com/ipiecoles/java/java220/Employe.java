package com.ipiecoles.java.java220;

import java.time.DateTimeException;
import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public abstract class Employe {
	
	protected String nom;
	protected String prenom;
	protected String matricule;
	protected LocalDate dateEmbauche;
	protected Double salaire;
	
	public abstract Double getPrimeAnnuelle();
	
	public Employe() {
		
	}
	
	public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire){
		
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMatricule(matricule);
		try {
			this.setDateEmbauche(dateEmbauche);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setSalaire(salaire);
		
	}
	
	public void augmenterSalaire(Double pourcentage) {
		this.salaire = this.salaire*(1+pourcentage);
		//this.setSalaire(this.salaire*(1+pourcentage));
	}
	
	@Override
		public String toString() {
			String chaine = new String("Employe{nom='" + this.nom + "', prenom='" + this.prenom + "', matricule='" + this.matricule + "', dateEmbauche=" + this.dateEmbauche + ", salaire=" + this.salaire +"}") ;
			return chaine;
		}
	
	@Override
		public boolean equals(Object obj) {
				return hashCode() == obj.hashCode();
			}
	
	@Override
		public int hashCode() {
			return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
		}
	
	public static Integer getNbConges() {	
		return Entreprise.NB_CONGES_BASE;
	}
	
	public final Integer getNombreAnneeAnciennete() {
		Integer anciennetee = LocalDate.now().getYear() - getDateEmbauche().getYear();	
		return anciennetee;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	
	public void setDateEmbauche(LocalDate dateEmbauche) throws Exception{
		
		if (dateEmbauche != null) {
			if (!dateEmbauche.isAfter(LocalDate.now())) {
				this.dateEmbauche = dateEmbauche;
			}else {
				throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
			}
		}	
	}
}
