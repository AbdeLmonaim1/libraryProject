package metier;

import java.util.List;

public interface IEmpMetierCatalogue {
	List<Emprunt> getEmpruntParId(String nom);
	public Emprunt ajouter(Emprunt emprunt);
	public void supprimerEmp(int idEm);
	public Emprunt modifier(Emprunt emprunt);
	public Emprunt getEmprunt(String nom);
}
