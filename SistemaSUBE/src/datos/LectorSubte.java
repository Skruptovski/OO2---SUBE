package datos;

public class LectorSubte extends Lector{
	private long idLectorSubte;
	private String estacionSubte;

	public LectorSubte() {}

	public LectorSubte(Linea linea,SaldoMinimo saldoMinimo, char tipoLector, String estacionSubte) {
		super(linea,saldoMinimo,tipoLector);
		this.estacionSubte = estacionSubte;
	}

	public long getIdLectorSubte() {
		return idLectorSubte;
	}

	protected void setIdLectorSubte(long idLectorSubte) {
		this.idLectorSubte = idLectorSubte;
	}

	public String getEstacionSubte() {
		return estacionSubte;
	}

	public void setEstacionSubte(String estacionSubte) {
		this.estacionSubte = estacionSubte;
	}
	
	

}
