<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
</head>
<body>

	<a href="novaTarefa">Criar nova tarefa</a>
	<section>
	
		<table>
			<thread>
				<tr>
					<th>ID</th><th>Descrição</th><th>Finalizado?</th><th>Data de finalização</th>
				</tr>				
			</thread>
			<c:forEach items="${tarefas}" var="tarefa">
			
				<tr>
					<td>${ tarefa.id }</td>
					<td>${ tarefa.descricao }</td>
					<c:if test="${tarefa.finalizado eq false }">
						<td>Não finalizado</td>
					</c:if>
					<c:if test="${tarefa.finalizado eq true }">
						<td>FInalizado</td>
					</c:if>
					<td>
						<fmt:formatDate value="${tarefa.dataFinalizacao.time }" pattern="dd/MM/yyyy" />
					</td>
				</tr>
			
			</c:forEach>
				
		</table>
	
	</section>


</body>
</html>