<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    
<!DOCTYPE html >
<html >
<head>
<meta  charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<form action="adicionaProdutos" method="post" enctype="multipart/form-data">	
		<div>					
			<label for="titulo">Titulo</label>
			<form:input path="produto.titulo" />			
			<form:errors path="produto.titulo" />
			 		
		</div>
		<div>					
			<label for="Descricao">Descrição</label>
			<form:textarea path="produto.descricao" rows="10" cols="20"/>			
			<form:errors path="produto.descricao" />			
		</div>
		
		<div>					
			<label for="paginas">Páginas</label>
			<form:input path="produto.paginas" />
			
			<form:errors path="produto.paginas" />			
						
		</div>
		 <div>
		 	<label for="dataLancamento">Data de Lançamento</label>
		 	<input name="dataLancamento" />
		 	<form:errors path="produto.dataLancamento" />
		 </div>
		 <c:forEach items="${tipos }" var="tipoPreco" varStatus="status">
		 <div>	
		 	<label for="paginas">${tipoPreco }</label>
		 	<form:input path="produto.precos[${status.index }].valor" />
		 	<form:hidden path="produto.precos[${status.index }].tipo" value="${tipoPreco }" />		 			 
		</div>	 
		 </c:forEach>
		 <div>
		 	<label for="sumario">Sumário</label>
		 	<input name="sumario" type="file" />
		 </div>
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>