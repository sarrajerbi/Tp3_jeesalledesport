package metier;

import java.util.List;
public interface ImetierCatapacite {
	public List<Salledesport> getSalledesportParMotCle(String mc);
	public void addsalledesport(Salledesport s);
}