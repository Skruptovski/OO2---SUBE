package test;

import negocio.EstacionABM;

public class TestAgregarEstacion {
	public static void main(String[] args) throws Exception {
		String estacion = "Burzaco";
		EstacionABM abm = EstacionABM.getInstanciaEstacionABM();
		abm.agregar(estacion);
		estacion = "Longchamps";
		abm.agregar(estacion);
		System.out.println("Cargado Exitosamente");
	}
}
