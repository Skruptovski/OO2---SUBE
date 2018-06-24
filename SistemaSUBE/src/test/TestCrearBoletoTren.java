package test;

import datos.LectorTren;
import datos.Tarjeta;
import negocio.LectorTrenABM;
import negocio.TarjetaABM;

public class TestCrearBoletoTren {
	public static void main(String[] args) throws Exception {
		LectorTrenABM labm = LectorTrenABM.getInstanciaLectorTrenABM();
		TarjetaABM tabm = TarjetaABM.getInstanciaTarjetaABM();
		Tarjeta tarjeta = tabm.traer(1);	
		LectorTren lector = labm.traer(5);
		System.out.println(lector);
		lector.crearBoleto(tarjeta);

	}

}
