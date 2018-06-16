package test;

import datos.Linea;
import datos.SaldoMinimo;
import negocio.LectorSubteABM;
import negocio.LineaABM;
import negocio.PrecioSubteABM;
import negocio.SaldoMinimoABM;

public class TestAgregarLectorSubte {
	public static void main(String[] args) throws Exception {
		SaldoMinimo saldoMinimo = SaldoMinimoABM.getInstanciaSaldoMinimoABM().traer(1);
		Linea linea = LineaABM.getInstanciaLineaABM().traer(2);
		LectorSubteABM abm= LectorSubteABM.getInstanciaLectorSubteABM();
		PrecioSubteABM pabm = PrecioSubteABM.getInstanciaPrecioSubteABM();
		abm.agregar(linea, saldoMinimo, "Jujuy", pabm.traer(1));
		System.out.println("Cargado Exitosamente");
	}
}