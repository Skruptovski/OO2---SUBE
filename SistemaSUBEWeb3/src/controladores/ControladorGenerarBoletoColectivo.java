package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.Boleto;
import datos.LectorColectivo;
import datos.Tarjeta;
import negocio.LectorColectivoABM;
import negocio.TarjetaABM;

public class ControladorGenerarBoletoColectivo extends HttpServlet {

	protected void doGet(HttpServletRequest request , HttpServletResponse response )
			throws ServletException, IOException {
		procesarPeticion( request , response );
	}
	protected void doPost(HttpServletRequest request , HttpServletResponse response )
			throws ServletException, IOException {
		procesarPeticion( request , response );
	}
	private void procesarPeticion(HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
		response .setContentType( "text/html;charset=UTF-8" );
		HttpSession session = request.getSession();
		try {
			int idTarjeta = Integer . parseInt ( request . getParameter ( "idTarjeta" ));
			int linea = Integer . parseInt(request.getParameter("linea"));
			int estado = Integer . parseInt(request.getParameter("estado"));
			LectorColectivoABM lectorAbm = LectorColectivoABM.getInstanciaLectorColectivoABM();
			TarjetaABM tarjetaAbm = TarjetaABM.getInstanciaTarjetaABM();
			Tarjeta tarjeta = tarjetaAbm.traerTarjetaYUsuario(idTarjeta);
			if(tarjeta==null){
				tarjeta = tarjetaAbm.traer(idTarjeta);
			}
			LectorColectivo lector = lectorAbm.traer(linea);
			lector.setEstado(estado);
			lector.crearBoleto(tarjeta);
			session.setAttribute("Tarjeta", tarjeta);
			List<Boleto> lista= tarjetaAbm.traerBoletosDeTarjeta(tarjeta.getIdTarjeta());
			Boleto boletoAux = lista.get(lista.size()-1);
			session.setAttribute("boleto", boletoAux);
			request.getRequestDispatcher("boletoC.jsp").forward(request, response);
			}
			catch (Exception e) {
			response.sendError(500, e.getMessage() );
			}
		
	}

}