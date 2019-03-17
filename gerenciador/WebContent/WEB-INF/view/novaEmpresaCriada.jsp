<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<c:if test="${not empty empresa }">
		<h3> Cadastrando nova empresa ${empresa}</h3>
	</c:if>
	<c:if test="${empty empresa }">
		<h3> Nenhuma empresa cadastrada meu parça!</h3>
	</c:if>
</html>