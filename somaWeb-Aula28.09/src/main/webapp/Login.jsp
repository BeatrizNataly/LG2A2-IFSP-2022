<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form name="login" method="get" action="Login.jsp">
		Usuário <input type="text" name="user">
		Senha <input type="password" name="pass">
		<input type="submit" value="Fazer login">
		
<%
	String output = "";
	String login[] = {"blue", "lobster"};
	
	if(request.getParameter("user") != null && request.getParameter("pass") != null){
		if(!request.getParameter("user").isEmpty() && !request.getParameter("pass").isEmpty()){
			if(login[0].equals(request.getParameter("user"))){
				if(login[1].equals(request.getParameter("pass"))){
					// seta a mensagem de boas vindas e redireciona
					request.setAttribute("mensagem", "Bem vindo(a) " + login[0]);
					RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
					rd.forward(request, response);
					//response.sendRedirect("Welcome.jsp");
				} else output += "Senha incorreta. ";
			} else output += "Usuário incorreto. ";
		} else output += "Preencha todos os campos para fazer login.";
	}
%>
	<p style="color: red"><%= output %></p>

</body>
</html>