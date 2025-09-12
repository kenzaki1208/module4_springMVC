<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Calculator</h1>
    <form action="${pageContext.request.contextPath}/week1/spring_controller/exercise/ex2/calculate" method="post">
        <input type="text" name="num1" placeholder="Enter number 1"/>
        <input type="text" name="num2" placeholder="Enter number 2"/>
        <br><br>

        <button type="submit" name="operator" value="add">+</button>
        <button type="submit" name="operator" value="sub">-</button>
        <button type="submit" name="operator" value="mul">*</button>
        <button type="submit" name="operator" value="div">/</button>
    </form>

    <h2>Result: ${message}: ${result}</h2>
</body>
</html>
