<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saudação</title>
</head>
<body>

<h1> Saudações... </h1>

<% for(int i = 10; i < 36; i++){
%>
<p style="font-size:<%=i %>px"> Hello World! </p>
<%	}  %>

</body>
</html>