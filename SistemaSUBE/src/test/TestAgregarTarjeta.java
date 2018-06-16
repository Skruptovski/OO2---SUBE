package test;

import java.util.GregorianCalendar;

import negocio.TarjetaABM;
import negocio.UsuarioABM;

public class TestAgregarTarjeta {
	public static void main(String[] args) throws Exception {
		double saldo = 284.70;
		boolean redSUBE = false;
		int nivelRS = 0;
		boolean baja = false;
		GregorianCalendar inicioRS = new GregorianCalendar();
		TarjetaABM abm = TarjetaABM.getInstanciaTarjetaABM();
		UsuarioABM uabm = UsuarioABM.getInstanciaUsuarioABM();
		abm.agregar(saldo, nivelRS,inicioRS, baja,uabm.traerI(1));
		System.out.println("Cargado Exitosamente");
	}
}
