<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Erro ao inserir aluno</title>
</head>
<body>
<p>Ocorreu um erro na inser��o do aluno. Tente atualizar a p�gina ou reinserir os dados do aluno no formul�rio.</p>
<form name="redirecionar" method="get" action="index.jsp">
		<p><input type="submit" value="Recarregar p�gina" ></p>
	</form>
<jsp:include page="index.jsp"></jsp:include>

</body>
</html>