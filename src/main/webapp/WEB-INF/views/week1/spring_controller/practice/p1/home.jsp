<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h1 { color: #333; }
        h3 { color: red; }
        form { margin-top: 20px; }
        input[type="text"] { padding: 8px; width: 300px; border: 1px solid #ccc; border-radius: 4px; }
        input[type="submit"] {
          padding: 10px 15px;
          background-color: #007bff;
          color: white;
          border: none;
          border-radius: 4px;
          cursor: pointer;
          margin-top: 10px;
        }
        input[type="submit"]:hover { background-color: #0056b3; }
    </style>
</head>
<body>
<h1>Email Validate</h1>
    <h3 style="color:red">${message}</h3>
    <form action="${pageContext.request.contextPath}/week1/spring_controller/practice/p1/validate" method="post">
      <input type="text" name="email" placeholder="Enter email to validate"><br>
      <input type="submit" value="Validate">
    </form>
</body>
</html>
