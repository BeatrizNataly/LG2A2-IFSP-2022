<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pacote.*" %>
<%@ page import="pacote.dao.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CRUD Aluno</title>
</head>
<body>
	<h1>Tabela relação de matrícula e aluno:</h1>
	<%
	// http://localhost:8080/CrudServer/index.jsp
	List<Aluno> listaDeAlunos = AlunoDao.getAllAlunos();
	request.setAttribute("list", listaDeAlunos);
	%>
	
	<form name="alunoMat" method="post" action="addaluno.jsp">
		Nome do aluno: <input type="text" name="aluno">
		Matrícula: <input type="text" name="matricula">
		<p><input type="submit" value="Salvar" ></p>
	</form>
	
	<table border="2px" 
	style="margin: 8px;">
		<tr>
			<td><h3 style="margin: 8px;">Nome</h3></td>
			<td><h3 style="margin: 8px;">Matrícula</h3></td>
			<td><h3 style="margin: 8px;">Editar</h3></td>
			<td><h3 style="margin: 8px;">Excluir</h3></td>
		</tr>
		<tr>
		<% 
		for(int i = 0; i < listaDeAlunos.size(); i++){ %>
		<tr>
			<td><%= listaDeAlunos.get(i).getNome()  %></td>
			<td><p><%= listaDeAlunos.get(i).getMatricula() %></p></td>
			<td><a href="editform.jsp?id=${aluno.getId() }">Editar</a></td>
			<td><a href="deletealuno.jsp?id=${aluno.getId() }">Excluir</a></td>
			<td></td>
		</tr>
		<% } %>		
		</tr>
</table>

</body>
</html>