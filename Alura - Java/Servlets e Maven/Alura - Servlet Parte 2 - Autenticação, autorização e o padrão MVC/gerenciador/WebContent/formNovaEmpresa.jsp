<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:url value="/entrada?acao=NovaEmpresa" var="linkNovaEmpresa" />


<!DOCTYPE html>
<html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>

    <body>
        <form action="${ linkNovaEmpresa }" method="POST">
            <label for="nome">Nome da Empresa: </label><input id="nome" type="text" name="nome">
            <label for="data">Data: </label><input id="data" type="text" name="data">
            
            <input type="submit">
        </form>
    </body>

</html>