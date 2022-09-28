<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
</head>
<body>
<form name="soma" method="get" action="SomaIndex.jsp">
		Valor 1: <input type="number" name="Valor1">
		Valor 2: <input type="number" name="Valor2">
		<input type="submit" value="Somar">
		
<%
	int soma = 0;

if(request.getParameter("Valor1") != null && request.getParameter("Valor2") != null) //Evita erro lógico por ter um campo vazio
	if(!request.getParameter("Valor1").isEmpty()&& !request.getParameter("Valor2").isEmpty()){
		//request.getParameter(x) - Pega o valor ao qual a var faz referencia
		int valor1 = Integer.parseInt(request.getParameter("Valor1")); 
		int valor2 = Integer.parseInt(request.getParameter("Valor2"));
		
		soma = valor1 + valor2;
	}
%>
<p>Resultado: </p>
<%= soma %>
</form>
</body>
</html>