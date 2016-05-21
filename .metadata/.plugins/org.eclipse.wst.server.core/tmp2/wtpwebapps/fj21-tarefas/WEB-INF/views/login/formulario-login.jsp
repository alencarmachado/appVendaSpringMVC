<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
	<!-- <link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" /> -->
	<link type="text/css" href="resources/css/bootstrap.css" rel="stylesheet" />
	<link type="text/css" rel="stylesheet" href="resources/css/bootstrap.min.css">
	 <script src="resources/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	
		<h2>Página de Login das Tarefas</h2>
		<form action="efetuaLogin" method="post">
		
			<div class="form-group">
				<label for="login">Login:</label>
		 		<input type="text" name="login" class="form-control"/>
		 	</div>	
		 	<div class="form-group">	
		 		<label for="senha">Senha: </label>
				<input type="password" name="senha" class="form-control"/>
				
				<button type="submit" class="btn btn-default">Entrar</button>	
			</div>		
		</form>
	
	
	</div>
	
	
	
</body>
</html>