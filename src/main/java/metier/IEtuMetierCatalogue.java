package metier;

import java.util.List;

public interface IEtuMetierCatalogue {
	List <Etudiant> getEtudiantParApogee(int Apogee);
	public Etudiant ajouterEtud(Etudiant E);
}
