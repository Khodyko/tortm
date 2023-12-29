<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>My Website</title>
</head>
<body>
<main>
    <h1>Welcome to My Website лалала</h1>
    <h1>
        <c:forEach var="cream" items="${creams}">
                ${cream.description}
        </c:forEach>
    </h1>
</main>

</body>
</html>