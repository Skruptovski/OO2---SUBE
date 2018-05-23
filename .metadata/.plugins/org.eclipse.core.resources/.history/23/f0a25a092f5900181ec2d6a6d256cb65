package negocio;
import java.util.List;

import dao.ViajeGratisDao;
import datos.Usuario;
import datos.ViajeGratis;

public class ViajeGratisABM {
	private static ViajeGratisABM instanciaViajeGratisABM;
	ViajeGratisDao dao = ViajeGratisDao.getInstanciaViajeGratisDao();
	
	public static ViajeGratisABM getInstanciaViajeGratisABM() {
		if ( instanciaViajeGratisABM == null ) {
			instanciaViajeGratisABM = new ViajeGratisABM();
		}
		return instanciaViajeGratisABM ;
		}
	
	public ViajeGratis traer( long id)throws Exception{
		ViajeGratis c= dao .traer(id);
		if(c==null) throw new Exception("El beneficio viaje gratis con esa ID no existe");
		else return c;
	}

	public int agregar(String beneficio, Usuario usuario, int cantidad){
		ViajeGratis c= new ViajeGratis(beneficio, usuario, cantidad);
			return dao .agregar(c);
	}
	
	public void modificar(ViajeGratis c){
		dao .actualizar(c);
	}
	
	public void eliminar( long id){ 
		ViajeGratis c= dao .traer(id);
		dao .eliminar(c);
	}
	
	public List<ViajeGratis> traer(){
		return dao .traer();
		}

}