package datos;

import java.util.*;

public class LectorColectivo extends Lector {
	private long idLectorColectivo;
	private String interno;
	private int estado;
	private Set<BotonColectivo> botonesColectivos;
	
	public LectorColectivo (){}

	public LectorColectivo(Linea linea,SaldoMinimo saldoMinimo, char tipoLector, String interno, int estado, Set<BotonColectivo> botonesColectivos) {
		super(linea, saldoMinimo, tipoLector);
		this.interno = interno;
		this.estado = estado;
		this.botonesColectivos = botonesColectivos;
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

	public Set<BotonColectivo> getBotonesColectivos() {
		return botonesColectivos;
	}

	public void setBotones(Set<BotonColectivo> botonesColectivos) {
		this.botonesColectivos = botonesColectivos;
	}

	@Override
	public String toString() {
		return "LectorColectivo [idLectorColectivo=" + idLectorColectivo + ", interno=" + interno + ", estado=" + estado
				+ "]";
	}
	
	

}
