<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Chuyển đổi USD sang VND</h1>
    <form action="${pageContext.request.contextPath}/week1/overview_with_spring_mvc/exercise/ex1/convert" method="post">
        <label>Tỉ giá(VND/USD): </label>
        <input type="number" step="0.01" name="rate" value="23000" min="20000" max="30000" required/><br><br>

        <label>Số tiền (USD):</label>
        <input type="number" step="0.01" name="usd" required><br><br>

        <button type="submit">Chuyển đổi</button>
    </form>
</body>
</html>
