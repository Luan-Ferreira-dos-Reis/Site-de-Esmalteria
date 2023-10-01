<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.belasUnhas.Servico" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento</title>
</head>
<body>	
	
	<p>serviços agendados</p>
	
	<ul>
		<c:forEach items="${listaServicos}" var="servico">		
			<li>${servico.nome}</li>
			<li>${servico.telefone}</li>
			<li>${servico.data}</li>
			<li>${servico.horario}</li>
			<li>${servico.descricao}</li>
		</c:forEach>		
	</ul>
	
	<br><br>
    <a href="index.html" class="contact-btn">Voltar</a>
</body>
</html>