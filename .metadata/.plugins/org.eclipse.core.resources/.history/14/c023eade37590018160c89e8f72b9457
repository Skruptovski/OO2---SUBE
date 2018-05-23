package test;
import datos.Beneficio;
import negocio.TarifaSocialABM;
import negocio.UsuarioABM;

public class TestAgregarUsuario {
	public static void main(String[] args) throws Exception {
		String apellido= "Saav" ;
		String nombre= "Diego" ;
		int documento=38111111;
		UsuarioABM abm= UsuarioABM.getInstanciaUsuarioABM();
		TarifaSocialABM tabm = TarifaSocialABM.getInstanciaTarifaSocialABM();
		Beneficio beneficio = tabm.traer(1);
		abm.agregar(apellido, nombre, documento,beneficio);
	}
}