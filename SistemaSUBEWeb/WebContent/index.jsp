<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<FORM method="POST" action="/SistemaSUBEWeb/tarjeta.jsp">
		<TR>
			<TABLE border="2">
				<TD><INPUT type="submit" value="Mostrar Datos de Tarjeta"></TD>
				</TR>
			</TABLE>
			<BR>
			<BR>
	</FORM>

	<FORM method="POST" action=" /SistemaSUBEWeb/CargarSaldo ">
			<TR>
				<TABLE border="2">
				<TD><INPUT type="submit" value="Cargar Saldo"></TD>
			</TR>
		</TABLE>
		<BR><BR>
	</FORM>

	<FORM method="POST" action=" /SistemaSUBEWeb/GenerarBoleto ">
			<TR>
			<TABLE border="2">
				<TD><INPUT type="submit" value="Generar Boleto"></TD>
			</TR>
		</TABLE>
		<BR><BR>
	</FORM>
</body>
</html>