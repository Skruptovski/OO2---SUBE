package datos;

import java.util.*;

public class LectorColectivo extends Lector {
	private long idLectorColectivo;
	private String interno;
	private int estado;
	private Set<BotonColectivo> botonesColectivo;
	
	public LectorColectivo (){}

	public LectorColectivo(Linea linea,SaldoMinimo saldoMinimo, char tipoLector, String interno, int estado) {
		super(linea, saldoMinimo, tipoLector);
		this.interno = interno;
		this.estado = estado;
	}

	public long getIdLectorColectivo() {
		return idLectorColectivo;
	}

	protected void setIdLectorColectivo(long idLectorColectivo) {
		this.idLectorColectivo = idLectorColectivo;
	}

	public String getInterno() {
		return interno;
	}

	public void setInterno(String interno) {
		this.interno = interno;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Set<BotonColectivo> getBotonesColectivo() {
		return botonesColectivo;
	}

	public void setBotonesColectivo(Set<BotonColectivo> botonesColectivo) {
		this.botonesColectivo = botonesColectivo;
	}

	@Override
	public String toString() {
		return "LectorColectivo [idLectorColectivo=" + idLectorColectivo + ", interno=" + interno + ", estado=" + estado
				+ "]";
	}
	
	

}
