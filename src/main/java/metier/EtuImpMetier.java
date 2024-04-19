package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EtuImpMetier implements IEtuMetierCatalogue {
	@Override
	public List<Etudiant> getEtudiantParApogee(int Apogee) {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from Etudiant where N_apogee like ?");
			st.setString(1,"%"+Apogee+"%");
			ResultSet result = st.executeQuery();
			while(result.next()) {
				Etudiant etudiant = new Etudiant();
				etudiant.setNApogee(result.getInt("N_apogee"));   
				etudiant.setNom(result.getString("Nom"));
				etudiant.setPrenom(result.getString("prenom"));
			
				etudiants.add(etudiant);
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}

		return etudiants;
	}

	@Override
	public Etudiant ajouterEtud(Etudiant etudiant) {
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("INSERT INTO Etudiant(N_apogee,Nom,prenom)"
					+"VALUES (?, ?, ?)");
			st.setInt(1,etudiant.getNApogee());
			st.setString(2,etudiant.getNom());
			st.setString(3,etudiant.getPrenom());
			st.executeUpdate();
			st.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		return etudiant;
	}

}
