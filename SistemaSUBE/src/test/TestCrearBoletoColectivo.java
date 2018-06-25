package test;

import datos.Lector;
import datos.LectorColectivo;
import datos.Tarjeta;
import negocio.BoletoABM;
import negocio.LectorABM;
import negocio.LectorColectivoABM;
import negocio.TarjetaABM;

public class TestCrearBoletoColectivo {
	public static void main(String[] args) throws Exception {
			LectorColectivoABM labm = LectorColectivoABM.getInstanciaLectorColectivoABM();
			TarjetaABM tabm = TarjetaABM.getInstanciaTarjetaABM();
			Tarjeta tarjeta = tabm.traer(1);	
			LectorColectivo lector = new LectorColectivo();
			lector=labm.traer(1);
			lector.setEstado(1); //1=10; 2=10.5; 3=10.75; 4=11//
			System.out.println(lector);
			lector.crearBoleto(tarjeta);

	}

}
