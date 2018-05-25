
package datos;

import java.util.*;

public class Carga {
	private long idCarga;
	private Tarjeta tarjeta;
	private Boleteria boleteria;
	private GregorianCalendar fechaHoraCarga;
	private double monto;
	
	public Carga (){}

	public Carga(Tarjeta tarjeta, Boleteria boleteria, GregorianCalendar fechaHoraCarga, double monto) {
		super();
		this.tarjeta = tarjeta;
		this.boleteria = boleteria;
		this.fechaHoraCarga = fechaHoraCarga;
		this.monto = monto;
	}

	public long getIdCarga() {
		return idCarga;
	}

	protected void setIdCarga(long idCarga) {
		this.idCarga = idCarga;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Boleteria getBoleteria() {
		return boleteria;
	}

	public void setBoleteria(Boleteria boleteria) {
		this.boleteria = boleteria;
	}

	public GregorianCalendar getFechaHoraCarga() {
		return fechaHoraCarga;
	}

	public void setFechaHoraCarga(GregorianCalendar fechaHoraCarga) {
		this.fechaHoraCarga = fechaHoraCarga;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Carga [idCarga=" + idCarga + ", tarjeta=" + tarjeta + ", fechaHoraCarga=" + fechaHoraCarga + ", monto="
				+ monto + "]";
	}

	
	
	
	

}
