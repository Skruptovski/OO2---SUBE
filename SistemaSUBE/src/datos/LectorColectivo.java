package datos;

import java.util.*;

import negocio.BoletoABM;
import negocio.BotonColectivoABM;
import negocio.LectorColectivoABM;
import negocio.TarifaSocialABM;

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
	
/*	public Boleto crearBoleto(Tarjeta tarjeta)throws Exception{
		if(estado==0){
			throw new Exception("Por favor, antes de aproximar su tarjeta, indique su destino");
		}
		
		BoletoABM bABM = BoletoABM.getInstanciaBoletoABM();
		long idBoton = estado;
		BotonColectivoABM bcABM = new BotonColectivoABM();
		BotonColectivo bc = new BotonColectivo();
		bc = bcABM.traer(idBoton);
		double monto = bc.getPrecioSeccionColectivo();
		GregorianCalendar fechaHora = new GregorianCalendar();
		double montoConDesc = monto;
		int nivRS = tarjeta.getNivelRS();
		LectorColectivoABM lcABM = new LectorColectivoABM();
		LectorColectivo lc = new LectorColectivo();
		lc = lcABM.traer(idLectorColectivo);
		
		int auxIfTS = 2;
		if(tarjeta.getUsuario().getBeneficio().getIdBeneficio()==auxIfTS){
			TarifaSocialABM tsABM = new TarifaSocialABM();
			TarifaSocial ts = new TarifaSocial();
			ts = tsABM.traer(auxIfTS);
			double porcDesc = ts.getPorcentajeDescuento();
			double auxPorc = 1-porcDesc;
			montoConDesc = montoConDesc*auxPorc;
			
		}
		
		if(ultimoBoleto.linea!=lector.linea)
		if(tarjeta.getBoletos().get(getBoletos().size()-1)!=null){ //aca hay q poner como condicion q la linea del ultimo boleto de lacoleccion de tarheta, sea diferente a la linea del lectorColectivo q quiere generar el boleto
			
			if(tarjeta.isRedSUBE()){
				if(tarjeta.getNivelRS()==1){
					montoConDesc = montoConDesc * 0.5;
					tarjeta.setNivelRS(nivRS+1);
				}
			
				if(tarjeta.getNivelRS()==2 || tarjeta.getNivelRS()==3){
					montoConDesc = montoConDesc * 0.25;
					tarjeta.setNivelRS(nivRS+1);
				}
				if(tarjeta.getNivelRS()==4){
					montoConDesc = montoConDesc * 0.25;
					tarjeta.setRedSUBE(false);
					tarjeta.setNivelRS(0);
				}
			}
			bABM.agregar(tarjeta, lc, monto, montoConDesc, fechaHora);
			Boleto b = new Boleto(tarjeta, lc, monto, montoConDesc, fechaHora);
			return b;
			
		}
		else{
			bABM.agregar(tarjeta, lc, monto, montoConDesc, fechaHora);
			Boleto b = new Boleto(tarjeta, lc, monto, montoConDesc, fechaHora);
			return b;
		}
	}*/

	@Override
	public String toString() {
		return "LectorColectivo [idLectorColectivo=" + idLectorColectivo + ", interno=" + interno + ", estado=" + estado
				+ "]";
	}
	
	

}
