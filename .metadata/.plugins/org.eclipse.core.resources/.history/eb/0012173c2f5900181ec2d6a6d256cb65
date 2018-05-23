package negocio;
import java.util.List;

import dao.MontoFijoDao;
import datos.MontoFijo;
import datos.Usuario;

public class MontoFijoABM {
	private static MontoFijoABM instanciaMontoFijoABM;
	MontoFijoDao dao = MontoFijoDao.getInstanciaMontoFijoDao();
	
	public static MontoFijoABM getInstanciaMontoFijoABM() {
		if ( instanciaMontoFijoABM == null ) {
			instanciaMontoFijoABM = new MontoFijoABM();
		}
		return instanciaMontoFijoABM ;
		}
	
	public MontoFijo traer( long id)throws Exception{
		MontoFijo c= dao .traer(id);
		if(c==null) throw new Exception("El beneficio fijo con esa ID no existe");
		else return c;
	}

	public int agregar(String beneficio, Usuario usuario, double monto){
		MontoFijo c= new MontoFijo(beneficio, usuario, monto);
			return dao .agregar(c);
	}
	
	public void modificar(MontoFijo c){
		dao .actualizar(c);
	}
	
	public void eliminar( long id){ 
		MontoFijo c= dao .traer(id);
		dao .eliminar(c);
	}
	
	public List<MontoFijo> traer(){
		return dao .traer();
		}

}