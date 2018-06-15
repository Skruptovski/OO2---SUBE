package test;

import negocio.LineaABM;

public class TestAgregarLinea {
	public static void main(String[] args) throws Exception {
		String linea = "B";
		LineaABM abm = LineaABM.getInstanciaLineaABM();
		abm.agregar(linea);
		System.out.println("Cargado Exitosamente");
	}
}
