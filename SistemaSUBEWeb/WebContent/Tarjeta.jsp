<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@page import="datos.Tarjeta" %>
    <% Tarjeta tarjeta=null;
    if(session.getAttribute("Tarjeta")!=null) tarjeta=(Tarjeta)session.getAttribute("Tarjeta"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<BODY>
	<FORM method="POST" action=" /SistemaSUBEweb/MostrarTarjeta ">
		Búsqueda de Tarjetas <BR><BR>
		<TABLE border="0">
			<TR>
				<TD>IdTarjeta:</TD>
				<TD><INPUT name="IdTarjeta"></TD>
			</TR>
			<TR>
				<TD><INPUT type="submit" value="Consultar"></TD>
			</TR>
		</TABLE>
	</FORM>
	<% if(tarjeta!=null){%>
	<strong>Su saldo es: </strong>
	<%tarjeta.getSaldo();
	}%>
</BODY>
</html>