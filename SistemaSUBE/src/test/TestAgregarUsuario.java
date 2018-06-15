package test;
import datos.Beneficio;
import negocio.BeneficioABM;
import negocio.UsuarioABM;

public class TestAgregarUsuario {
	public static void main(String[] args) throws Exception {
		String apellido= "Saave" ;
		String nombre= "Dar�o" ;
		int documento=33311111;
		UsuarioABM abm= UsuarioABM.getInstanciaUsuarioABM();
		BeneficioABM tabm = BeneficioABM.getInstanciaBeneficioABM();
		Beneficio beneficio = tabm.traer(1);
		abm.agregar(apellido, nombre, documento,beneficio);
		System.out.println("Cargado Exitosamente");
	}
}