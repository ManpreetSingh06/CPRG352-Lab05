<%-- 
    Document   : login
    Created on : 18-Feb-2022, 6:53:42 PM
    Author     : Manpreet Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            <label>UserName:</label>
            <input type="text" name="user" value="">
            <br
             <label>Password:</label>
            <input type="password" name="pass" value="">
            <br>
            <input type="submit" value="login">
            <br>
            <p>${invalid}</p>
            <p>${logout}</p>
        </form>
    </body>
</html>
