<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html >
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
	
	<link type="text/css" href="https://cdn.datatables.net/1.10.10/css/dataTables.bootstrap.min.css" rel="stylesheet" />
	<link type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" />
  
	<script type="text/javascript" src="//code.jquery.com/jquery-1.12.0.min.js" ></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js" ></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.10/js/dataTables.bootstrap.min.js" ></script>
	



</head>
<body>

<div class="container">
	<section>
	
		<form:errors path="tarefa.descricao" cssStyle="color: red"/>
	<form action="adicionaTarefas" method="post">
		<fieldset>
		
		<c:choose>
			<c:when test="${tarefa != null}"> 
					<legend>Alterar tarefa - ${tarefa.id}</legend>
					<input type="hidden" name="id" value="${tarefa.id }" />
			</c:when>
			<c:otherwise>
					<legend>Adicionar tarefas</legend>
			</c:otherwise>
		</c:choose>
			<div class="form-group">
			<label for="descricao">Descrição</label>
			<textarea name="descricao" id="descricao"  rows="5" cols="100" class="form-control">${tarefa.descricao }</textarea>
			</div>	

			<c:choose>
				<c:when test="${tarefa != null }">
				<div class="form-group">
					
					<div class="checkbox">
						<label for="finalizado">Finalizado?
						<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : '' } />
						</label>
						
					</div>
					<label for="dataFinalizacao">Data de finalização: </label>
					<input type="text"class="form-control" name="dataFinalizacao" value=" <fmt:formatDate 
					value="${tarefa.dataFinalizacao.time }" pattern="dd/MM/yyyy" /> "  />
				</div>	
				</c:when>				
			</c:choose>
			<button type="submit" class="btn btn-default">Adicionar</button>
		</fieldset>
	</form>
	
	</section>
	
	
	
	<section>
	
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thread>
				<tr>
					<th>ID</th><th>Descrição</th><th>Finalizado?</th><th>Data finalização</th><th>Finalizar?</th><th>Ações</th>
				</tr>				
			</thread>
			
 		<tfoot>
            <tr>
                <th>Name</th>
                <th>Position</th>
                <th>Office</th>
                <th>Age</th>
                <th>Start date</th>
                <th>Salary</th>
            </tr>
        </tfoot>
			<c:forEach items="${tarefas}" var="tarefa">
			
				<tr id="removeTarefa_${tarefa.id }">
					<td>${ tarefa.id }</td>
					<td>${ tarefa.descricao }</td>
					<c:if test="${tarefa.finalizado eq false }">
						<td>Não finalizado</td>
					</c:if>
					<c:if test="${tarefa.finalizado eq true }">
						<td style="color:red;">Finalizado</td>
					</c:if>
					<td>
						<fmt:formatDate value="${tarefa.dataFinalizacao.time }" pattern="dd/MM/yyyy" />
					</td>
					
					<td id="tarefa_${tarefa.id }">
						<div style="text-align:center">
						
					<c:choose>
					
						<c:when test="${tarefa.finalizado eq false }">
							<a  href="#" onclick="finalizaAgora(${tarefa.id})">OK</a>
						</c:when>
						<c:otherwise>
							Finalizado
						</c:otherwise>
					</c:choose>
						
						 
						 						
						</div>
					</td>
					<td>
						<!-- <a style="margin: 10px;" href="removeTarefa?id=${tarefa.id}">Remover</a> -->
						<a class="btn btn-danger"   href="#" onclick="remover(${tarefa.id})">Remover</a>
						<a class="btn btn-danger"   href="carregaTarefa?id=${tarefa.id}">Alterar</a>
					</td>
				</tr>
			
			</c:forEach>
				
		</table>
	
	</section>

	<script type="text/javascript">
		
		function finalizaAgora(id){
			$.post("finalizaTarefa", {'id' : id}, function(){
				//seleciona o elemento html atraves da ID e altera o HTML dele				
			$("#tarefa_"+id).html("<span style='color: yellow;'>Finalizado</span>");
				
			});							
		}
		
		function remover(id){
			$.post("removeTarefa",{'id':id}, function(){
				$("removeTarefa_"+id).closest("tr").hide();
			});
		}
		
		 
	
	</script>
</div><!-- fecha div container -->

<script type="text/javascript">	
$(document).ready(function() {
    $('#example').DataTable();
} );
	
</script>

</body>
</html>