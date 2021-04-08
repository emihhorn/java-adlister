<%--
  Created by IntelliJ IDEA.
  User: emilyhorn
  Date: 4/8/21
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }%>

<html>
<head>


    <title>Login</title>
</head>
<body>

<h1>Enter login here</h1>

<form action="/login.jsp" method="post">

    <div class="container">
        <label for = ><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name = "username" required>

        <label for = ><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name = "password" required>

        <button type="submit">Login</button>
        <label>
            <input type="checkbox" checked="checked" name = "remember"> Remember
        </label>

    </div>


</form>
</body>
</html>
