<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="org.example.demospringmvc.week2_data_binding_and_form_practice.p2.model.Login" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h3>Home</h3>
    <form:form action="${pageContext.request.contextPath}/week2_data_binding_and_form_practice/p2/login"
               method="post"
               modelAttribute="login">
        <fieldset>
            <legend>Login</legend>
            <table>
                <tr>
                    <td><form:label path="account">Account: </form:label></td>
                    <td><form:input path="account"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password: </form:label></td>
                    <td><form:password path="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:button>Login</form:button></td>
                </tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
