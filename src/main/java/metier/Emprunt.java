package metier;

import java.io.Serializable;
import java.util.Date;

public class Emprunt implements Serializable{
private int idEmp;
private int n_apogee;
private int idLiv;
private String titre;
private String nom;
private String prenom;
private String dateEmp;
public int getIdEmp() {
	return idEmp;
}
public void setIdEmp(int idEmp) {
	this.idEmp = idEmp;
}
public int getN_apogee() {
	return n_apogee;
}
public void setN_apogee(int n_apogee) {
	this.n_apogee = n_apogee;
}
public int getIdLiv() {
	return idLiv;
}
public void setIdLiv(int idLiv) {
	this.idLiv = idLiv;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
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
public String getDateEmp() {
	return dateEmp;
}
public void setDateEmp(String dateEmp) {
	this.dateEmp = dateEmp;
}
public Emprunt() {
	super();
	// TODO Auto-generated constructor stub
}
public Emprunt(int n_apogee, int idLiv, String titre, String nom, String prenom, String dateEmp) {
	super();
	this.n_apogee = n_apogee;
	this.idLiv = idLiv;
	this.titre = titre;
	this.nom = nom;
	this.prenom = prenom;
	this.dateEmp = dateEmp;
}



}
