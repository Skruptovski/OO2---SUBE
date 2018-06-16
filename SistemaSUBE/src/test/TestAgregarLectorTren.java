package test;

import datos.Estacion;
import datos.Linea;
import datos.SaldoMinimo;
import negocio.EstacionABM;
import negocio.LectorSubteABM;
import negocio.LectorTrenABM;
import negocio.LineaABM;
import negocio.PrecioSubteABM;
import negocio.SaldoMinimoABM;

public class TestAgregarLectorTren {
	public static void main(String[] args) throws Exception {
	SaldoMinimo saldoMinimo = SaldoMinimoABM.getInstanciaSaldoMinimoABM().traer(1);
	Linea linea = LineaABM.getInstanciaLineaABM().traer(1);
	LectorTrenABM abm= LectorTrenABM.getInstanciaLectorTrenABM();
	EstacionABM eabm = EstacionABM.getInstanciaEstacionABM();
	Estacion estacion = eabm.traer(1);
	abm.agregar(linea, saldoMinimo, false, estacion);
	System.out.println("Cargado Exitosamente");
	}
}