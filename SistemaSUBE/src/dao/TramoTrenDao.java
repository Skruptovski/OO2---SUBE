package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.TarifaSocial;
import datos.TramoTren;
import datos.BoletoEstudiantil;
import datos.LectorTren;

public class TramoTrenDao {
	private static Session session ;
	private Transaction tx ;
	private static TramoTrenDao instanciaTramoTrenDao;
	
	public static TramoTrenDao getInstanciaLectorTrenDao() {
		if ( instanciaTramoTrenDao == null ) {
			instanciaTramoTrenDao = new TramoTrenDao();
		}
		return instanciaTramoTrenDao ;
		}
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil. getSessionFactory ().openSession();
		tx = session .beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx .rollback();
		throw new HibernateException( "ERROR en la capa de acceso a datos" , he);
	}
	
	public int agregar(TramoTren objeto) {int id = 0;
		try {
			iniciaOperacion();
			id = Integer. parseInt ( session .save(objeto).toString());
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session .close();
		}
		return id;
	}
	
	public void actualizar(TramoTren objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session .update(objeto);
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
			} finally {
			session .close();
			}
		}
				
	public void eliminar(TramoTren objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session .delete(objeto);
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session .close();
		}
	}
		
	public TramoTren traer( long id) throws HibernateException {
		TramoTren objeto = null ;
		try {
			iniciaOperacion();
			objeto = (TramoTren) session .get(TramoTren. class , id);
		} finally {
			session .close();
		}
		return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<TramoTren> traer() throws HibernateException {
		List<TramoTren> lista= null ;
		try {
			iniciaOperacion();
			lista= session .createQuery( "from TramoTren" ).list();
		} finally {
			session .close();
		}
		return lista;
	}
}