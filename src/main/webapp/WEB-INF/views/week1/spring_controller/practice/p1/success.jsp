<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h3 { color: green; }
        a { color: #007bff; text-decoration: none; margin-top: 20px; display: inline-block; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
    <h3>Hi ${email}! Your email is valid!</h3>
    <p><a href="${pageContext.request.contextPath}/week1/spring_controller/practice/p1">Go back to home</a></p>
</body>
</html>
