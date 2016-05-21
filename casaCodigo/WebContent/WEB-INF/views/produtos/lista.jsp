<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %> 
    
<!DOCTYPE html >
<html >
<head>
<meta  charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<h1>Lista de Produtos</h1>
	 
	 <table>
	 	<thead>
	 	<tr> <th>Título</th><th>Descrição</th><th>Páginas</th> </tr>
	 	</thead>
		<c:forEach items="${produtos }" var="produto" >
			<tr>
				<td>
				<a href="${s:mvcUrl('PC#detalhe').arg(0,produto.id).build()}">					
					${produto.titulo }</a>
				</td>
				<td>${produto.descricao }</td>
				<td>${produto.paginas }</td>
			</tr>
		</c:forEach>
	 
	 </table>
	 

</body>
</html>