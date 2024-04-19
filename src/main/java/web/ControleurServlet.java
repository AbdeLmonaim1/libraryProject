package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.BiblioImpMetier;
import metier.EmpImpMetier;
import metier.Emprunt;
import metier.EtuImpMetier;
import metier.LivImplMetier;
import metier.Livre;
import metier.IEmpMetierCatalogue;
import metier.IEtuMetierCatalogue;
import metier.ILivMetierCatalog;
import metier.IntLogin;

@WebServlet(name = "cs", urlPatterns = "*.com")
public class ControleurServlet extends HttpServlet {
	private IEmpMetierCatalogue empMetier;
	private IEtuMetierCatalogue etuMetier;
	private ILivMetierCatalog livMetier;
	private IntLogin loginmetier;

	@Override
	public void init() throws ServletException {
		empMetier = new EmpImpMetier();
		etuMetier = new EtuImpMetier();
		livMetier = new LivImplMetier();
		loginmetier = new BiblioImpMetier();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if (path.equals("/home.com")) {
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		if (path.equals("/login.com")) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else if (path.equals("/connect.com")) {
			String user = req.getParameter("username");
			String password = req.getParameter("password");
			if (loginmetier.verifieLojin(user, password) == true) {
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			} else {
				String error = "Login ou mot de passe est incorrecte";
				req.setAttribute("error", error);
				req.getRequestDispatcher("login.jsp").forward(req, resp);

			}
		} else if (path.equals("/livre.com")) {
			req.getRequestDispatcher("livres.jsp").forward(req, resp);

		}
		if (path.equals("/chercher.com")) {
			String titre = req.getParameter("motcle");
			BiblioModel modele = new BiblioModel();
			modele.setTitre(titre);
			List<Livre> livres = livMetier.getLivreParTitre(titre);
			/* if( req.getParameter("selctedoption").equals("Titre") ) { */
			modele.setLivre(livres);
			req.setAttribute("modele", modele);
			req.getRequestDispatcher("livres.jsp").forward(req, resp);
			/* } */
			/*
			 * else if( req.getParameter("selctedoption").equals("Auteur") ) { String auteur
			 * = req.getParameter("motcle"); modele = new BiblioModel();
			 * modele.setTitre(auteur); livres =livMetier.getLivreParTitre(auteur);
			 * modele.setLivre(livres); req.setAttribute("modele", modele);
			 * req.getRequestDispatcher("livres.jsp").forward(req, resp);
			 * 
			 * } else if(req.getParameter("selctedoption").equals("Genre")) { String genre =
			 * req.getParameter("motcle"); modele = new BiblioModel();
			 * modele.setTitre(genre); livres =livMetier.getLivreParTitre(genre);
			 * modele.setLivre(livres); req.setAttribute("modele", modele);
			 * req.getRequestDispatcher("livres.jsp").forward(req, resp); }
			 */
		} else if (path.equals("/ajouter.com")) {
			req.getRequestDispatcher("ajouterLivre.jsp").forward(req, resp);
		} else if (path.equals("/ajouterButton.com") && req.getMethod().equals("POST")) {
			String titre = req.getParameter("titre");
			String auteur = req.getParameter("auteur");
			int nbrEx = Integer.parseInt(req.getParameter("nbrEx"));
			String genre = req.getParameter("genre");
			Livre livre = livMetier.ajouter(new Livre(titre, auteur, nbrEx, genre));
			req.setAttribute("livreAjo", livre);
			req.getRequestDispatcher("confirmationAjout.jsp").forward(req, resp);

		} else if (path.equals("/supprimer.com")) {
			int id = Integer.parseInt(req.getParameter("id"));
			livMetier.supprimer(id);
			// req.getRequestDispatcher("LivreView.jsp").forward(req, resp);
			resp.sendRedirect("chercher.com?motcle= ");
		} else if (path.equals("/modifier.com")) {
			String titre = req.getParameter("titre");
			Livre livre = livMetier.getLivre(titre);
			req.setAttribute("livreModif", livre);
			req.getRequestDispatcher("modifierLivre.jsp").forward(req, resp);
		} else if (path.equals("/modifierButton.com") && req.getMethod().equals("POST")) {
			int id = Integer.parseInt(req.getParameter("idliv"));
			String titre = req.getParameter("titre");
			String auteur = req.getParameter("auteur");
			int nbrEx = Integer.parseInt(req.getParameter("nbrEx"));
			String genre = req.getParameter("genre");

			Livre livre = new Livre(titre, auteur, nbrEx, genre);
			livre.setIdLivre(id);
			livMetier.modifier(livre);
			req.setAttribute("livreAjo", livre);
			req.getRequestDispatcher("confirmationAjout.jsp").forward(req, resp);
			
		}else if(path.equals("/emprunt.com")) {
			req.getRequestDispatcher("empruntList.jsp").forward(req, resp);
			
		}else if(path.equals("/chercherEm.com")) {
			String nom = req.getParameter("nom");
			EmpruntModel model = new EmpruntModel();
			model.setNom(nom);
			List<Emprunt> emps = empMetier.getEmpruntParId(nom);
			model.setEmprunts(emps);
			req.setAttribute("modEmp", model);
			req.getRequestDispatcher("empruntList.jsp").forward(req, resp);
	}
		else if (path.equals("/ajouterEmp.com")) {
			req.getRequestDispatcher("ajouterEmprunt.jsp").forward(req, resp);
		} else if (path.equals("/ajouterEmprButton.com") && req.getMethod().equals("POST")) {
			int apog = Integer.parseInt(req.getParameter("apog"));
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			int idliv = Integer.parseInt(req.getParameter("idliv"));
			String titre = req.getParameter("titre");
			String date = req.getParameter("date");
			Emprunt emprunt = empMetier.ajouter(new Emprunt(apog, idliv, titre, nom, prenom, date));
			req.setAttribute("empruntAjou", emprunt);
			req.getRequestDispatcher("confirmationEmprunt.jsp").forward(req, resp);
		}else if (path.equals("/modifieremp.com")) {
			String nom = req.getParameter("nomEm");
			Emprunt emprunt = empMetier.getEmprunt(nom);
			req.setAttribute("empruntModif", emprunt);
			req.getRequestDispatcher("modifierEmpr.jsp").forward(req, resp);
		}else if (path.equals("/modifierEmpButton.com") && req.getMethod().equals("POST")) {
			int idem = Integer.parseInt(req.getParameter("idem"));   
			int apog = Integer.parseInt(req.getParameter("apogeeEm"));  
			int idlivEm = Integer.parseInt(req.getParameter("idlivEm"));
			String titreEm = req.getParameter("titreEm");
			String nomEm = req.getParameter("nomEm");
			String prenomEm = req.getParameter("prenomEm");
			String dateEm = req.getParameter("dateEm");
            
			Emprunt emprunt = new Emprunt(apog, idlivEm, titreEm, nomEm, prenomEm, dateEm );
			emprunt.setNom(nomEm);
			empMetier.modifier(emprunt);
			req.setAttribute("empruntAjo", emprunt);
			req.getRequestDispatcher("confirmationEmprunt.jsp").forward(req, resp);
			
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
