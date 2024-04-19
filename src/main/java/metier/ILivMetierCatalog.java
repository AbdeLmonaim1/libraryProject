package metier;

import java.util.List;

public interface ILivMetierCatalog {
	
	List <Livre> getLivreParTitre(String tit);
	List <Livre> getLivreParAuteur(String aut);
	List <Livre> getLivreGenre(String gen);
	public Livre ajouter(Livre livre);
	public void supprimer(int idLiv);
	public Livre modifier(Livre livre);
    public Livre getLivre(String titre);
	 }

