package datos;

import java.util.Set;

public class Estacion {
	private long idEstacion;
	private String estacion;
	private Set<TramoTren> estacion1;
	private Set<TramoTren> estacion2;
	
	public Estacion() {}
	
	public Estacion(String estacion) {
		this.estacion = estacion;
	}

	public long getIdEstacion() {
		return idEstacion;
	}

	protected void setIdEstacion(long idEstacion) {
		this.idEstacion = idEstacion;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public Set<TramoTren> getEstacion1() {
		return estacion1;
	}

	public void setEstacion1(Set<TramoTren> estacion1) {
		this.estacion1 = estacion1;
	}

	public Set<TramoTren> getEstacion2() {
		return estacion2;
	}

	public void setEstacion2(Set<TramoTren> estacion2) {
		this.estacion2 = estacion2;
	}
	
	

}
