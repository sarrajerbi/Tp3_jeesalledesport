package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatapacite {
@Override
public void addsalledesport(Salledesport s){
	// TODO Auto-generated method stub
}
@Override
public List<Salledesport> getSalledesportParMotCle(String mc) {
	List<Salledesport> salles= new ArrayList<Salledesport>();
	Connection conn=SingletonConnection.getConnection();
	try {

	PreparedStatement ps= conn.prepareStatement("select * from SalledesportS where NOM_Salledesport LIKE ?");

	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	Salledesport s = new Salledesport();
	s.setIdSalledesport(rs.getLong("ID_Salledesport"));
	s.setNomSalledesport(rs.getString("NOM_Salledesport"));
	s.setPrix(rs.getDouble("capacite"));
	salles.add(s);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return salles;
}
}