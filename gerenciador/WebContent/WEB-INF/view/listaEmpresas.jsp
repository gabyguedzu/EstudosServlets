<%@page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
	<body>
	Usuario logado: ${usuarioLogado.login}
	<br>
	
	<c:if test="${not empty empresa }">
		<h3> Cadastrando nova empresa ${empresa}</h3>
	</c:if>
	
	Lista de empresas: <br />
	<ul>
		<c:forEach items="${empresas}" var="empresa">		
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </li>
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remover</a>
		</c:forEach>	
	</ul>
    </body>
</html>