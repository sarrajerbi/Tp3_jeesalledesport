package web;
import java.util.ArrayList;
import java.util.List;

import metier.Salledesport;
public class SalledesportModele {
private String motCle;
List<Salledesport> salledesport = new ArrayList<>();
	public String getMotCle() {
	return motCle;
	}
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	public List<Salledesport> getSalledesport() {
	return salledesport;
	}
	public void setSalledesport(List<Salledesport> salledesport) {
	this.salledesport = salledesport;
	}

}