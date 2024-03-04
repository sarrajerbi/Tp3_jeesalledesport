package metier;

public class Salledesport {
	private Long idSalledesport;
	private String nomSalledesport;
	private double capacite;
	public Salledesport() {
	super();
	}
	public Salledesport(String nomSalledesport, double capacite) {
	super();
	this.nomSalledesport = nomSalledesport;
	this.capacite = capacite;
	}
	public Long getIdSalledesport() {
	return idSalledesport;
	}
	public void setIdSalledesport(Long idSalledesport) {
	this.idSalledesport = idSalledesport;
	}
	public String getNomSalledesport() {
	return nomSalledesport;
	}
	public void setNomSalledesport(String nomSalledesport) {
	this.nomSalledesport = nomSalledesport;
	}
	public double getcapacite() {
	return capacite;
	}
	public void setPrix(double capacite) {
		this.capacite = capacite;
		}
		}