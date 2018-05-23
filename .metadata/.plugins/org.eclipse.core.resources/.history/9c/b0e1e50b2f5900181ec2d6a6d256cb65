package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.ViajeGratis;

public class ViajeGratisDao {
	private static Session session ;
	private Transaction tx ;
	private static ViajeGratisDao instanciaViajeGratisDao;
	
	public static ViajeGratisDao getInstanciaViajeGratisDao() {
		if ( instanciaViajeGratisDao == null ) {
			instanciaViajeGratisDao = new ViajeGratisDao();
		}
		return instanciaViajeGratisDao ;
		}
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil. getSessionFactory ().openSession();
		tx = session .beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx .rollback();
		throw new HibernateException( "ERROR en la capa de acceso a datos" , he);
	}
	
	public int agregar(ViajeGratis objeto) {int id = 0;
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
	
	public void actualizar(ViajeGratis objeto) throws HibernateException {
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
				
	public void eliminar(ViajeGratis objeto) throws HibernateException {
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
		
	public ViajeGratis traer( long id) throws HibernateException {
		ViajeGratis objeto = null ;
		try {
			iniciaOperacion();
			objeto = (ViajeGratis) session .get(ViajeGratis. class , id);
		} finally {
			session .close();
		}
		return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<ViajeGratis> traer() throws HibernateException {
		List<ViajeGratis> lista= null ;
		try {
			iniciaOperacion();
			lista= session .createQuery( "from viajeGratis" ).list();
		} finally {
			session .close();
		}
		return lista;
	}
}