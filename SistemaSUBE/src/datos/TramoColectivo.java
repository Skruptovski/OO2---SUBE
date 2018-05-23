package datos;

public class TramoColectivo {
	private long idTramoColectivo;
	private SeccionColectivo seccionColectivo;
	
	public TramoColectivo(){}
	
	public TramoColectivo(SeccionColectivo seccionColectivo) {
		this.seccionColectivo = seccionColectivo;
	}

	public long getIdTramoColectivo() {
		return idTramoColectivo;
	}

	protected void setIdTramoColectivo(long idTramoColectivo) {
		this.idTramoColectivo = idTramoColectivo;
	}

	public SeccionColectivo getSeccionColectivo() {
		return seccionColectivo;
	}

	public void setSeccionColectivo(SeccionColectivo seccionColectivo) {
		this.seccionColectivo = seccionColectivo;
	}
	
	

}
