<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
    <h3>Welcome, Enter The Employee Details</h3>
    <form:form method="POST"
               action="${pageContext.request.contextPath}/week2_data_binding_and_form_practice/p1/employee/add-employee"
               modelAttribute="employee">
        <table>
            <tr>
                <td><form:label path="id">Employee ID: </form:label></td>
                <td><form:input path="id"/></td>
            </tr>
            <tr>
                <td><form:label path="name">Employee's name: </form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">Contact's number: </form:label></td>
                <td><form:input path="contactNumber"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
