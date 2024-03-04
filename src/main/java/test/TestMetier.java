package test;

import java.util.List;

import metier.MetierImpl;
import metier.Salledesport;
	public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Salledesport> salles = metier.getSalledesportParMotCle("go gym");
		for (Salledesport s : salles)
		System.out.println(s.getNomSalledesport());
}
}
