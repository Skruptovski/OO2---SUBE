package negocio;
import java.util.*;

import dao.TarjetaDao;
import datos.Boleto;
import datos.Tarjeta;
import datos.Usuario;

public class TarjetaABM {
	private static TarjetaABM instanciaTarjetaABM;
	TarjetaDao dao = TarjetaDao.getInstanciaTarjetaDao();
	
	public static TarjetaABM getInstanciaTarjetaABM() {
		if ( instanciaTarjetaABM == null ) {
			instanciaTarjetaABM = new TarjetaABM();
		}
		return instanciaTarjetaABM ;
		}
	
	public Tarjeta traer( long id)throws Exception{
		Tarjeta c= dao .traer(id);
		if(c==null) throw new Exception("La Tarjeta con esa ID no existe");
		else return c;
	}

	public int agregar(double saldo, int nivelRS,GregorianCalendar inicioRS, boolean baja,Usuario usuario){
		Tarjeta c= new Tarjeta(saldo,nivelRS,inicioRS,baja,usuario);
			return dao .agregar(c);
	}
	
	public void modificar(Tarjeta c){
		dao .actualizar(c);
	}
	
	public void eliminar( long id){ 
		Tarjeta c= dao .traer(id);
		dao .eliminar(c);
	}
	
	public List<Tarjeta> traer(){
		return dao .traer();
		}
	
	public List<Boleto> traerBoletosDeTarjeta(long id){
		return dao.traerBoletosDeTarjeta(id);
	}

}