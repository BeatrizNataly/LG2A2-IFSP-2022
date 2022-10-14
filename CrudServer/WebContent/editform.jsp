<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="pacote.*" %>
<%@ page import="pacote.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar aluno</title>
</head>
<body>

<% 
	String id = request.getParameter("id");
	Aluno aluno = AlunoDao.getAlunoById(Integer.parseInt(id));
%>

	<h1>Editar dados do Aluno:</h1>
	<form action="editaluno.jsp" method="post">
		<input type="hidden" name="id" value="<%=aluno.getId()%>"/>
		<table>
			<tr>
				<td>Nome: </td>
				<td><input type="text" name="nome" value="<%=aluno.getNome()%>"/></td>
				<td>Matrícula: </td>
				<td><input type="text" name="matricula" value="<%=aluno.getMatricula()%>"/></td>
			</tr>
		</table>
	</form>

</body>
</html>