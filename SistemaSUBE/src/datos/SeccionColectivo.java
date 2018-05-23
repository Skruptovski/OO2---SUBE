package datos;

import java.util.Set;

public class SeccionColectivo {
	private long idSeccionColectivo;
	private double precioSeccionColectivo;
	private Set<TramoColectivo> tramosColectivo;
	
	public SeccionColectivo(){}

	public SeccionColectivo(double precioSeccionColectivo) {
		super();
		this.precioSeccionColectivo = precioSeccionColectivo;
	}

	public long getIdSeccionColectivo() {
		return idSeccionColectivo;
	}

	protected void setIdSeccionColectivo(long idSeccionColectivo) {
		this.idSeccionColectivo = idSeccionColectivo;
	}

	public double getPrecioSeccionColectivo() {
		return precioSeccionColectivo;
	}

	public void setPrecioSeccionColectivo(double precioSeccionColectivo) {
		this.precioSeccionColectivo = precioSeccionColectivo;
	}

	public Set<TramoColectivo> getTramosColectivo() {
		return tramosColectivo;
	}

	public void setTramosColectivo(Set<TramoColectivo> tramosColectivo) {
		this.tramosColectivo = tramosColectivo;
	}
	
	
}
