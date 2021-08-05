<%--
  Created by IntelliJ IDEA.
  User: thirugo
  Date: 02-08-2021
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    <br><br>
    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    <form:radiobuttons path="programmingLanguage" items="${student.favLanguageOptions}"/>
    <br><br>
    <form:checkboxes path="operatingSystems" items="${student.operatinsSystemOptions}"/>
    <br><br>
    <input type="submit" value="Submit"/>
    <br><br>
</form:form>

</body>
</html>
