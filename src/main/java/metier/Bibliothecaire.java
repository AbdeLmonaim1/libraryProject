package metier;

import java.io.Serializable;

public class Bibliothecaire implements Serializable{
	private int idbib;
	private String loginbib;
	private String pswbib;
	
	public Bibliothecaire(String loginbib, String pswbib) {
		super();
		this.loginbib = loginbib;
		this.pswbib = pswbib;
	}
	
	public Bibliothecaire() {
		super();
	}

	public int getIdbib() {
		return idbib;
	}
	public void setIdbib(int idbib) {
		this.idbib = idbib;
	}
	public String getLoginbib() {
		return loginbib;
	}
	public void setLoginbib(String loginbib) {
		this.loginbib = loginbib;
	}
	public String getPswbib() {
		return pswbib;
	}
	public void setPswbib(String pswbib) {
		this.pswbib = pswbib;
	}

}