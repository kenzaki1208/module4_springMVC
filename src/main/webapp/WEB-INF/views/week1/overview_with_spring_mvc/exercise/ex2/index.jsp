<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/week1/overview_with_spring_mvc/exercise/ex2/translate" method="post">
        <input type="text" name="word" placeholder="Enter a word"/>
        <button type="submit">Translate</button>
    </form>

    <c:if test="${not empty result}">
    <p>Word: ${word}</p>
        <p>Result: ${result}</p>
    </c:if>
</body>
</html>
