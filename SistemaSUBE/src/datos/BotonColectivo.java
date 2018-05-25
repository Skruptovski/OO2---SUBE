package datos;

public class BotonColectivo {
	private long idBotonColectivo;
	private double tarifa;
	
	public BotonColectivo (){}

	public BotonColectivo(long idBoton, double tarifa) {
		super();
		this.idBotonColectivo = idBotonColectivo;
		this.tarifa = tarifa;
	}

	public long getIdBotonColectivo() {
		return idBotonColectivo;
	}

	protected void setIdBotonColectivo(long idBoton) {
		this.idBotonColectivo = idBoton;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Boton [idBotonColectivo=" + idBotonColectivo + ", tarifa=" + tarifa + "]";
	}
	
	

}
