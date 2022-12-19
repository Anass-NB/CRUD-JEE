<%@page import="java.util.List"%>
<%@page import="metier.User"%>
<%@page import="metier.UserImp"%>
<%@page import="web.UserModele"%>
<%@page import="web.UserModele"%>
<%
    User us;
    us = (User) request.getAttribute("myuser");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USer updated Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <tr>
                <th>ID</th><th>Password</th><th>LOGIN</th><th>EMAIL</th><th>VILLE</th>
            </tr>

            <tr>                
                <td><%= us.getId()%></td>
                <td><%= us.getPassword()%></td>
                <td><%=us.getLogin()%></td>
                <td><%=us.getEmail()%></td> 
                <td><%=us.getVille()%></td>

            </tr>


        </table>
    </body>
</html>
