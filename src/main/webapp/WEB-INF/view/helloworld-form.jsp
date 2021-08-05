<%--
  Created by IntelliJ IDEA.
  User: thirugo
  Date: 31-07-2021
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>

<h1>Process form in default version</h1>
<form action="processForm" method="get">

    <input type="text" name="studentName" placeholder="enter your name here"/>
    <input type="submit"/>
</form>

<h1>Process form in upper case version</h1>
<form action="processFormVersionThree" method="get">

    <input type="text" name="studentName" placeholder="enter your name here"/>
    <input type="submit"/>
</form>
</body>
</html>
