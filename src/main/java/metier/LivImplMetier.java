package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivImplMetier implements ILivMetierCatalog{
	
	@Override
	public List<Livre> getLivreParTitre(String tit) {
		List<Livre> livres = new ArrayList<Livre>();
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from livre where Titre like ?");
			st.setString(1,"%"+tit+"%");
			ResultSet result = st.executeQuery();
			while(result.next()) {
				Livre livre = new Livre();
				livre.setIdLivre(result.getInt("idLiv"));   
				livre.setTitre(result.getString("Titre"));
				livre.setAuteur(result.getString("Nom_auteur"));
				livre.setNbrExemp(result.getInt("Nbrs_Exemplaires"));
				livre.setGenre(result.getString("genre"));
				livres.add(livre);
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}

		return livres;
	}

	@Override
	public List<Livre> getLivreParAuteur(String aut) {
		List<Livre> livres = new ArrayList<Livre>();
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from livre where Nom_auteur like ?");
			st.setString(1,"%"+aut+"%");
			ResultSet result = st.executeQuery();
			while(result.next()) {
				Livre livre = new Livre();
				livre.setIdLivre(result.getInt("idLiv"));   
				livre.setTitre(result.getString("Titre"));
				livre.setAuteur(result.getString("Nom_auteur"));
				livre.setNbrExemp(result.getInt("Nbrs_Exemplaires"));
				livre.setGenre(result.getString("genre"));
				livres.add(livre);
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}

		return livres;
	}

	@Override
	public List<Livre> getLivreGenre(String gen) {
		List<Livre> livres = new ArrayList<Livre>();
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from livre where genre like ?");
			st.setString(1,"%"+gen+"%");
			ResultSet result = st.executeQuery();
			while(result.next()) {
				Livre livre = new Livre();
				livre.setIdLivre(result.getInt("idLiv"));   
				livre.setTitre(result.getString("Titre"));
				livre.setAuteur(result.getString("Nom_auteur"));
				livre.setNbrExemp(result.getInt("Nbrs_Exemplaires"));
				livre.setGenre(result.getString("genre"));
				livres.add(livre);
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}

		return livres;
	}

	@Override
	public Livre ajouter(Livre livre) {
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("INSERT INTO Livre(Titre,Nom_auteur,Nbrs_Exemplaires,genre)"
					+"VALUES (?, ?, ?, ?)");
			st.setString(1,livre.getTitre());
			st.setString(2,livre.getAuteur());
			st.setInt(3,livre.getNbrExemp());
			st.setString(4,livre.getGenre());
			st.executeUpdate();
			PreparedStatement stId = mycon.prepareStatement("Select MAX(idLiv) as ID_MAX From livre");
			ResultSet result = stId.executeQuery();
			if(result.next()) {
				livre.setIdLivre(result.getInt("ID_MAX"));
				}
			st.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		return livre;
	}

	@Override
	public void supprimer(int idLiv) {
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("DELETE FROM livre WHERE 	idLiv = ?");
			st.setInt(1, idLiv);
			st.executeUpdate();
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public Livre modifier(Livre livre) {
		Connection myCon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = myCon.prepareStatement("Update Livre Set Titre = ? ,Nom_auteur=?,"
					+ "Nbrs_Exemplaires=? , genre = ? WHERE idLiv = ?");
			st.setString(1,livre.getTitre());
			st.setString(2,livre.getAuteur());
			st.setInt(3,livre.getNbrExemp());
			st.setString(4,livre.getGenre());
			st.setInt(5,livre.getIdLivre());
			st.executeUpdate();
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return livre;
	}

	@Override
	public Livre getLivre(String titre) {

		Livre livre=null;
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("SELECT * FROM livre WHERE Titre = ?");
			st.setString(1, titre);
			ResultSet res = st.executeQuery();
			if(res.next()) {
				livre= new Livre();
				livre.setIdLivre(res.getInt("idLiv"));
				livre.setAuteur(res.getString("Nom_auteur"));	
				livre.setTitre(res.getString("Titre"));
				livre.setNbrExemp(res.getInt("Nbrs_Exemplaires"));
				livre.setGenre(res.getString("genre"));
			}
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return livre;

	}
	
}
