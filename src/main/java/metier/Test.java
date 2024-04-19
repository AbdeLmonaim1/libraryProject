package metier;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpImpMetier emp = new EmpImpMetier();
		List<Emprunt> emprunts = emp.getEmpruntParId("Boukil");
		Emprunt em = emprunts.get(0);
		System.out.println(em.getN_apogee());
		
	}

}
