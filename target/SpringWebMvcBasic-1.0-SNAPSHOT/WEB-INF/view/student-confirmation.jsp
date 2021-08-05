<%--
  Created by IntelliJ IDEA.
  User: thirugo
  Date: 02-08-2021
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Information Page</title>
</head>
<body>

The student information as follows:

<h1> First Name: ${student.firstName}</h1>
<h2> Last Name: ${student.lastName}</h2>
<h3> The country name you selected is :<b>${student.country}</b></h3>
<h3> Programming language :<b>${student.programmingLanguage}</b></h3>
<br>
Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>



</body>
</html>
