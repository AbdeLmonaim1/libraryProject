package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BiblioImpMetier implements IntLogin{

	@Override
	public Boolean verifieLojin(String loIn, String psw) {
		boolean res = false;
		Connection mycon = SingletonConnection.getConnection();
		try {
			PreparedStatement st = mycon.prepareStatement("select * from bibliothecaire where Login = ? and PWD = ?");
			st.setString(1,loIn);
			st.setString(2,psw);
			ResultSet result = st.executeQuery();
			
			if(result.next()) {
			res = true;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

}
