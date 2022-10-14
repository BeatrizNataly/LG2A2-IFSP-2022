<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="pacote.*" %>
<%@ page import="pacote.dao.*" %>
<<jsp:useBean id="a" class="pacote.Aluno"></jsp:useBean>
<<jsp:setProperty property="*" name="a"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionando usuário...</title>
</head>
<body>

<%
	int i = AlunoDao.insertAluno(a);
	if(i > 0){
		response.sendRedirect("index.jsp");
	}else{
		response.sendRedirect("addaluno-error.jsp");
	}
%>

</body>
</html>