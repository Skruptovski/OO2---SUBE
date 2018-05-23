package test;

import datos.Usuario;
import negocio.UsuarioABM;
import negocio.ViajeGratisABM;

public class TestAgregarViajeGratis {
	public static void main(String[] args) throws Exception {
		String beneficio= "Plan Viaje Gratis" ;
		int cantidad = 30;
		UsuarioABM uabm = UsuarioABM.getInstanciaUsuarioABM();
		Usuario usuario = uabm.traerI(3);
		ViajeGratisABM dabm = ViajeGratisABM.getInstanciaViajeGratisABM();
		dabm.agregar(beneficio,usuario,cantidad);
	}
}
