package negocio;
import java.util.List;

import dao.DescuentoDao;
import datos.Descuento;
import datos.Usuario;

public class DescuentoABM {
	private static DescuentoABM instanciaDescuentoABM;
	DescuentoDao dao = DescuentoDao.getInstanciaDescuentoDao();
	
	public static DescuentoABM getInstanciaDescuentoABM() {
		if ( instanciaDescuentoABM == null ) {
			instanciaDescuentoABM = new DescuentoABM();
		}
		return instanciaDescuentoABM ;
		}
	
	public Descuento traer( long id)throws Exception{
		Descuento c= dao .traer(id);
		if(c==null) throw new Exception("El descuento con esa ID no existe");
		else return c;
	}

	public int agregar(String beneficio, Usuario usuario, double porcentajeDescuento){
		Descuento c= new Descuento(beneficio, usuario, porcentajeDescuento);
			return dao .agregar(c);
	}
	
	public void modificar(Descuento c){
		dao .actualizar(c);
	}
	
	public void eliminar( long id){ 
		Descuento c= dao .traer(id);
		dao .eliminar(c);
	}
	
	public List<Descuento> traer(){
		return dao .traer();
		}

}