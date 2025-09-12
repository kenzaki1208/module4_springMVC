<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Your choice: </h1>
    <ul>
        <c:forEach items="${condiments}" var="c">
            <li>${c}</li>
        </c:forEach>
    </ul>
</body>
</html>
