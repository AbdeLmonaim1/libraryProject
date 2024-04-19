package web;

import java.util.ArrayList;
import java.util.List;

import metier.Emprunt;

public class EmpruntModel {
	private String nom;
	 public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	List<Emprunt> emprunts = new ArrayList<Emprunt>();

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}
