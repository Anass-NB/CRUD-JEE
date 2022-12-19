<%@page import="metier.User"%>
<%@page import="metier.UserImp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit user | id = <%= request.getParameter("id")%></title>
        <style><%@include file="/WEB-INF/css/style.css"%></style>
    </head>
    <body>

        <%
            UserImp us = new UserImp();
            User use = us.GetClientByID(request.getParameter("id"));
        %>


        <form action="add" method="post">
            <div class="form">
                <label for="id">ID : </label>
                <input type="text" name="id" value="<%=request.getParameter("id")%>">
                <label for="login">login : </label>
                <input type="text" name="login" placeholder="<%=use.getLogin()%>">
                <label for="password">password : </label>
                <input type="password" name="password" placeholder="<%=use.getPassword()%>">
                <label for="email">email : </label>
                <input type="email" name="email" placeholder="<%=use.getEmail()%>">
                <label for="ville">ville : </label>
                <input type="text" name="ville" placeholder="<%=use.getVille()%>">
                <input  type="submit" value="Edit user">
            </div>
        </form>

    </body>
</html>
