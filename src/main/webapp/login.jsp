<%--
  Created by IntelliJ IDEA.
  User: emilyhorn
  Date: 4/8/21
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    System.out.println(request.getMethod());
    if (request.getMethod().equalsIgnoreCase("POST")) {
        String username = (request.getParameter("username") != null) ? request.getParameter("username") : "";
        String password = (request.getParameter("password") != null) ? request.getParameter("password") : "";
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/login.jsp" method="POST">
    <label for="username">Username</label>
    <input id="username" type="text" name="username" placeholder="Enter username">
    <label for="password">Password</label>
    <input id="password" type="password" name="password" placeholder="Enter password">
    <button>Submit</button>
</form>
</body>
</html>