package datos;

public class Boleteria {
	private long idBoleteria;
	private String boleteria;
	
	public Boleteria (){}

	public Boleteria(String boleteria) {
		super();
		this.idBoleteria = idBoleteria;
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

	@Override
	public String toString() {
		return "Boleteria [idBoleteria=" + idBoleteria + ", boleteria=" + boleteria + "]";
	}
	
	

}
