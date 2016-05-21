<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<h2>Página inicial da Lista de Tarefas</h2>
	<p>Bem vindo, ${usuarioLogado.login}</p>
	<p><a href="listaTarefas">Clique aqui</a> para acessar a lista de tarefas</p>
	<a href="logout">Sair do sistema</a>
	<a href="tabelaPaginada">tabela paginada</a>
</body>
</html>