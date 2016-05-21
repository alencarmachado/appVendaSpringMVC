<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
 
  <meta charset="utf-8">
  
<link href=<c:url value="css/bootstrap.min.css"/> rel="stylesheet"> 
  <script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.min.js"></script>




</head>
<body>

	 	
 
 <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a style="color: blue" class="navbar-brand" href="#">Bem vindo(a) 
            
            	${usuario.login}
            
            </a>
          </div><!-- fim navbar -->
          
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
             
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastro <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Tarefas</a></li>
                  <li><a href="#">....</a></li>
                  <li><a href="#">....</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Administrativo</li>
                  <li><a href="#">Usu�rios</a></li>
                  <li><a href="#">...</a></li>
                </ul>
              </li>
               <li><a href="#">Sobre</a></li>
              <li><a href="#">Contato</a></li>
            </ul>
            <!-- <ul class="nav navbar-nav navbar-right">
              <li class="active"><a href="./">Default <span class="sr-only">(current)</span></a></li>
              <li><a href="../navbar-static-top/">Static top</a></li>
              <li><a href="../navbar-fixed-top/">Fixed top</a></li>
            </ul> -->
          </div><!--/.nav-collapse -->
          
        </div><!--/.container-fluid -->
      </nav>
 
 
</body>
</html>