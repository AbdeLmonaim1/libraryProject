package metier;

import java.io.Serializable;

public class Livre implements Serializable{
     private int idLivre ;
     private String titre;
     private String auteur;
     private int nbrExemp ; 
     private String genre;
     
     Livre(){
    	 super();
     }
     public Livre(String titre,String auteur,int nbrExemp,String genre){
    	 super();
    	 this.titre=titre;
    	 this.auteur=auteur;
    	 this.nbrExemp=nbrExemp;
    	 this.genre=genre;
     }
     
	public int getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
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
	public int getNbrExemp() {
		return nbrExemp;
	}
	public void setNbrExemp(int nbrExemp) {
		this.nbrExemp = nbrExemp;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

