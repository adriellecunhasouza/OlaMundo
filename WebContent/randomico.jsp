<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerador de Números</title>
</head>
<body>
    <h1>Gerador de Número Randomico</h1>
	<% java.util.Random geradorDeNumeros = new Random(); %>
	<%= geradorDeNumeros.nextInt(100) %>
</body>
</html>