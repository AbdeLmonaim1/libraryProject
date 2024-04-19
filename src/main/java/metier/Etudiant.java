package metier;

import java.io.Serializable;

public class Etudiant implements Serializable{
private int NApogee;
private String Nom;
private String Prenom;

Etudiant(){
	super();
}
public Etudiant(int NApogee,String Nom,String Prenom) {
	super();
	this.NApogee=NApogee;
	this.Nom=Nom;
	this.Prenom=Prenom;
}
public int getNApogee() {
	return NApogee;
}
public void setNApogee(int nApogee) {
	NApogee = nApogee;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}

}
