package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Tarjeta;
import negocio.Funciones;
import negocio.TarjetaABM;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class ControladorMostrarTarjeta extends HttpServlet {

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
			int idTarjeta = Integer . parseInt ( request . getParameter ( "IdTarjeta" ));
			TarjetaABM tarjetaAbm = TarjetaABM.getInstanciaTarjetaABM();
			Tarjeta tarjeta = tarjetaAbm . traer ( idTarjeta );
			session.setAttribute("Tarjeta", tarjeta);
			request.getRequestDispatcher("/Tarjeta.jsp").forward(request, response);
			}
			catch (Exception e) {
			response.sendError(500, "El ID de Tarjeta ingresado no existe en la base de datos." );
			}
		
	}

}