<%-- 
    Document   : home
    Created on : 18-Feb-2022, 6:53:31 PM
    Author     : Manpreet Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2>
        <a href="home?logout">Log Out</a>
    </body>
</html>
