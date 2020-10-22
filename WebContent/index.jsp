
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem-Vindo</h1>
	<br><br>
    
    <form method = "post"  action = "ola-mundo">
        Entre com um nome: <input type = "text" name = "nome"/>
        <input type = "submit" value = "Entrar"/>
    </form>
    <br>
    <%= request.getParameter("erro") %>
    
    <br><br><br><br><br>
    A hora agora é: <%= new java.util.Date() %>
	
	
</body>
</html>
