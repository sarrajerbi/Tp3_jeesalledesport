package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ImetierCatapacite;
import metier.MetierImpl;
import metier.Salledesport;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
	private ImetierCatapacite metier;
	@Override
	public void init() throws ServletException {
		metier=new MetierImpl();
	}
	@Override
	protected void doPost(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException {
		
		String mc=request.getParameter("motCle");
		SalledesportModele mod = new SalledesportModele();
		mod.setMotCle(mc);
		List<Salledesport> salles = metier.getSalledesportParMotCle(mc);
		mod.setSalledesport(salles);
		request.setAttribute("modele", mod);
		request.getRequestDispatcher("SalledesportsView.jsp").forward(request,response);
		}
		}