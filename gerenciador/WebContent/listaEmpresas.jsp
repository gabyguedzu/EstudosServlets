<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>

<html>
	<body>
	Lista de empresas: <br />
    <ul>
    <%
        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
        for (Empresa empresa : lista) { 
    %>
        <li><%= empresa.getNome() %></li>
    <%
        }
    %>
    </ul>
    </body>
</html>