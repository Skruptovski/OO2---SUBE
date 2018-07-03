<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="datos.Tarjeta"%>
<%@page import="negocio.TarjetaABM"%>
<%@page import="datos.Boleto"%>
<%@page import="datos.Carga"%>
<%@page import="java.util.*"%>
<% Tarjeta tarjeta=null;
    if(session.getAttribute("Tarjeta")!=null) tarjeta=(Tarjeta)session.getAttribute("Tarjeta"); 
    TarjetaABM tabm = TarjetaABM.getInstanciaTarjetaABM();%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Sube - Estadisticas</title>
</head>
<BODY>

	<FORM method="POST" action="/SistemaSUBEWeb/MostrarTarjeta">
		Estadisticas por fecha <BR>
		<BR>
		<TABLE border="0">
			<TR>
				<TD>IdTarjeta:</TD>
				<TD><INPUT name="IdTarjeta"></TD>
				<BR>
			</TR>
			
			
			<TR>
				<TD>diaInicio:</TD>
				<TD><INPUT name="dI"></TD>
			</TR>
			<TR>
				<TD>mesInicio:</TD>
				<TD><INPUT name="mI"></TD>
			</TR>
			<TR>
				<TD>anioInicio:</TD>
				<TD><INPUT name="aI"></TD>
			</TR>
			
			<TR>
				<TD>diaFin:</TD>
				<TD><INPUT name="dF"></TD>
			</TR>
			<TR>
				<TD>mesFin:</TD>
				<TD><INPUT name="mF"></TD>
			</TR>
			<TR>
				<TD>anioFin:</TD>
				<TD><INPUT name="aF"></TD>
			</TR>
			
			<TR>
				<TD><INPUT type="submit" value="Consultar"></TD>
			</TR>
		</TABLE>
	</FORM>

	<% if(tarjeta!=null){%>
	<strong>Su saldo es: </strong>
	<%
	List<Boleto> boletos = tabm.traerBoletosDeTarjeta(tarjeta.getIdTarjeta());
	List<Carga> cargas = tabm.traerCargasDeTarjeta(tarjeta.getIdTarjeta());
	
	int dI = Integer . parseInt ( request . getParameter ( "dI" ));
	int mI = Integer . parseInt ( request . getParameter ( "mI" ));
	int aI = Integer . parseInt ( request . getParameter ( "aI" ));
	
	int dF = Integer . parseInt ( request . getParameter ( "dF" ));
	int mF = Integer . parseInt ( request . getParameter ( "mF" ));
	int aF = Integer . parseInt ( request . getParameter ( "aF" ));
	
	GregorianCalendar fechaInicial = new GregorianCalendar(aI,mI,dI); 
	GregorianCalendar fechaFinal = new GregorianCalendar(aF,mF,dF); 
	
	out.println(tarjeta.getSaldo());%>
	<BR>
	<%out.println(tarjeta.getUsuario());%>
	<BR>
	<%out.println(boletos);%>
	<BR>
	<%out.println(cargas);%>
	<BR>
	<%out.println(tarjeta.estadisticaPorTransporte(fechaInicial, fechaFinal));
	}%>
</BODY>
</html>