<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Sandwich Condiments</h1>
    <form action="${pageContext.request.contextPath}/week1/spring_controller/exercise/ex1/save" method="post">
        <input type="checkbox" name="condiment" value="Lettuce"> Lettuce
        <input type="checkbox" name="condiment" value="Tomato"> Tomato
        <input type="checkbox" name="condiment" value="Mustard"> Mustard
        <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
        <br><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
