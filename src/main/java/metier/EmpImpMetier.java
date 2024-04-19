package metier;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpImpMetier implements IEmpMetierCatalogue{

	@Override
	public List<Emprunt> getEmpruntParId(String nom) {
		List<Emprunt> emprunts = new ArrayList<Emprunt>();
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from emprunt where NomEt like ?");
			st.setString(1, "%"+nom+"%");
			ResultSet result = st.executeQuery();
			while(result.next()) {
				Emprunt emprunt = new Emprunt();
				emprunt.setIdEmp(result.getInt("IdEm"));
				emprunt.setN_apogee(result.getInt("N_apogee"));
				emprunt.setIdLiv(result.getInt("IdLiv"));
				emprunt.setTitre(result.getString("titreli"));
				emprunt.setNom(result.getString("NomEt"));
				emprunt.setPrenom(result.getString("PrenomEt"));
				emprunt.setDateEmp(result.getString("dateEm"));
				emprunts.add(emprunt);
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}

		return emprunts;
	}

	@Override
	public Emprunt ajouter(Emprunt emprunt) {
		// TODO Auto-generated method stub
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("INSERT INTO Emprunt(N_apogee,IdLiv,titreli,NomEt,PrenomEt,dateEm)"
					+"VALUES (?, ?, ?, ?, ?, ?)");
			st.setInt(1,emprunt.getN_apogee());
			st.setInt(2,emprunt.getIdLiv());
			st.setString(3,emprunt.getTitre());
			st.setString(4,emprunt.getNom());
			st.setString(5,emprunt.getPrenom());
			st.setString(6,emprunt.getDateEmp());
			st.executeUpdate();
			PreparedStatement stId = mycon.prepareStatement("Select MAX(IdEm) as ID_MAX From Emprunt");
			ResultSet result = stId.executeQuery();
			if(result.next()) {
				emprunt.setIdEmp(result.getInt("ID_MAX"));
				}
			st.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		return emprunt;
	}

	@Override
	public void supprimerEmp(int idEm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Emprunt modifier(Emprunt emprunt) {
		Connection myCon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = myCon.prepareStatement("Update emprunt Set N_apogee = ? ,IdLiv=?,"
					+ "titreli=? , NomEt = ? , PrenomEt = ? , dateEm = ? WHERE NomEt = ?");
			st.setInt(1, emprunt.getN_apogee());
			st.setInt(2, emprunt.getIdLiv());
			st.setString(3, emprunt.getTitre());
			st.setString(4, emprunt.getNom());
			st.setString(5, emprunt.getPrenom());
			st.setString(6, emprunt.getDateEmp());
			st.executeUpdate();
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return emprunt;
	}

	@Override
	public Emprunt getEmprunt(String nom) {
		Emprunt emprunt=null;
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from emprunt where NomEt like ?");
			st.setString(1, nom);
			ResultSet res = st.executeQuery();
			if(res.next()) {
				emprunt= new Emprunt();
				emprunt.setIdEmp(res.getInt("IdEm"));
				emprunt.setIdLiv(res.getInt("IdLiv"));
				emprunt.setN_apogee(res.getInt("N_apogee"));
	            emprunt.setNom(res.getString("NomEt"));
				emprunt.setPrenom(res.getString("PrenomEt"));
				emprunt.setTitre(res.getString("titreli"));
				emprunt.setDateEmp(res.getString("dateEm"));
				
			}
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return emprunt;
	}

	
	
}
