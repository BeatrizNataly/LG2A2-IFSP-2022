<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="server_LP.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servidor</title>
</head>
<body>
	<h1>Servidor de java</h1>
	<% out.print("Bye bye!"); %>
	
	<% Aluno al1 = new Aluno(); %>
	<% al1.setNome("Beatriz Nataly"); %>
	<% al1.setMatricula("SP1234567"); %>

	<% Aluno al2 = new Aluno(); %>
	<% al2.setNome("Rodrigo Bezerra"); %>
	<% al2.setMatricula("SP0987654"); %>
	
	<% Aluno al3 = new Aluno(); %>
	<% al3.setNome("Luiza Silva de Sousa"); %>
	<% al3.setMatricula("SP5647382"); %>

	<table>
  <tr>
    <th>Nome</th>
    <th>Matrícula</th>
  </tr>
  <tr>
    <td><%= al1.getNome() %></td>
    <td><%= al1.getMatricula() %></td>
  </tr>
  <tr>
    <td><%= al2.getNome() %></td>
    <td><%= al2.getMatricula() %></td>
  </tr>
   <tr>
    <td><%= al3.getNome() %></td>
    <td><%= al3.getMatricula() %></td>
  </tr>
</table>

</body>
</html>