<%-- 
    Document   : adduser
    Created on : Dec 17, 2022, 12:41:18 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add user</title>
    </head>
    <body>
        <h1>Add new User!</h1>
        <form action="/add" method="post">
            <label for="login">login</label>
            <input type="text" name="login">
            <label for="password">password</label>
            <input type="password" name="password">
            <label for="email">email</label>
            <input type="email" name="email">
            <label for="ville">ville</label>
            <input type="text" name="ville">
            <input type="submit" value="Add user">
        </form>
    </body>
</html>
