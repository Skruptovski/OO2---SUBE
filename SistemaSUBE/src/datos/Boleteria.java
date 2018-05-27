package datos;

import java.util.Set;

public class Boleteria {
	private long idBoleteria;
	private String boleteria;
	private Set<Carga> cargas;
	
	public Boleteria (){}

	public Boleteria(String boleteria) {
		this.boleteria = boleteria;
	}

	public long getIdBoleteria() {
		return idBoleteria;
	}

	protected void setIdBoleteria(long idBoleteria) {
		this.idBoleteria = idBoleteria;
	}

	public String getBoleteria() {
		return boleteria;
	}

	public void setBoleteria(String boleteria) {
		this.boleteria = boleteria;
	}

	
	public Set<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(Set<Carga> cargas) {
		this.cargas = cargas;
	}

	@Override
	public String toString() {
		return "Boleteria [idBoleteria=" + idBoleteria + ", boleteria=" + boleteria + "]";
	}
	
	

}
