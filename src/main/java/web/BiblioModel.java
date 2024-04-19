package web;

import java.util.ArrayList;
import java.util.List;

import metier.Emprunt;
import metier.Livre;

public class BiblioModel {
    private String titre;
    private String auteur;
    private String genre;
    private int nbrBook;
    private int nbrEtudiant;
    private int nbrEmprunt;
    private String adminNom;
    private String adminPrenom;
    
    private String nom;
    public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	List<Livre> livres = new ArrayList<Livre>();
    List<Emprunt> emprunts = new ArrayList<Emprunt>();
    
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Livre> getLivre() {
		return livres;
	}
	public void setLivre(List<Livre> livre) {
		this.livres = livre;
	}

	public List<Emprunt> getEmprunt() {
		return emprunts;
	}
	public void setEmprunt(List<Emprunt> emprunt) {
		this.emprunts = emprunt;
	}
	public int getNbrBook() {
		return nbrBook;
	}
	public void setNbrBook(int nbrBook) {
		this.nbrBook = nbrBook;
	}
	public int getNbrEtudiant() {
		return nbrEtudiant;
	}
	public void setNbrEtudiant(int nbrEtudiant) {
		this.nbrEtudiant = nbrEtudiant;
	}
	public int getNbrEmprunt() {
		return nbrEmprunt;
	}
	public void setNbrEmprunt(int nbrEmprunt) {
		this.nbrEmprunt = nbrEmprunt;
	}
	public String getAdminNom() {
		return adminNom;
	}
	public void setAdminNom(String adminNom) {
		this.adminNom = adminNom;
	}
	public String getAdminPrenom() {
		return adminPrenom;
	}
	public void setAdminPrenom(String adminPrenom) {
		this.adminPrenom = adminPrenom;
	}
	
    
}
