package datos;

public class Descuento extends Beneficio {
	private long idDescuento;
	private double porcentajeDescuento;
	
	public Descuento() {}

	public Descuento(String beneficio, Usuario usuario,double porcentajeDescuento) {
		super(beneficio,usuario);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public long getIdDescuento() {
		return idDescuento;
	}

	protected void setIdDescuento(long idDescuento) {
		this.idDescuento = idDescuento;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public String toString() {
		return "Descuento [idDescuento=" + idDescuento + ", porcentajeDescuento=" + porcentajeDescuento
				+ ", beneficio= " + getBeneficio() + "]";
	}

}
