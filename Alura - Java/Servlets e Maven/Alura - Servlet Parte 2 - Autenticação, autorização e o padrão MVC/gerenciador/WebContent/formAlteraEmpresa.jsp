<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada?acao=AlteraEmpresa" var="link" />


<!DOCTYPE html>
<html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>

    <body>
        <form action="${ link }" method="POST">
            <label for="nome">Nome da Empresa: </label><input id="nome" type="text" name="nome" value="${ empresa.nome }">
            <label for="data">Data: </label><input id="data" type="text" name="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>">
            <input type="hidden" name="id" value="${ empresa.id }">
            <input type="submit">
        </form>
    </body>

</html>