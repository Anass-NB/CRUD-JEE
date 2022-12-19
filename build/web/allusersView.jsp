<%@page import="metier.User"%>
<%@page import="java.util.List"%>
<%@page import="web.UserModele"%>
<%
    UserModele mod;
    if (request.getAttribute("modele") != null) {
        mod = (UserModele) request.getAttribute("modele");
    } else {
        mod = new UserModele();
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Users</title>
        <style><%@include file="/WEB-INF/css/style.css"%></style>
    </head>
    <body>
        <h1 style="
    font-size: 40px;
    text-align: center;
">All Users</h1>
      
        <form action="add" method="post">
            <div class="form">
                <label for="id">ID: </label>
                <input type="text" name="id">
                <label for="login">login : </label>
                <input type="text" name="login">
                <label for="password">password : </label>
                <input type="password" name="password">
                <label for="email">email : </label>
                <input type="email" name="email">
                <label for="ville">ville : </label>
                <input type="text" name="ville">
                <input type="submit" value="Add user">
            </div>
        </form>
        <table>
            <tr>
                <th>ID</th><th>LOGIN</th><th>EMAIL</th><th>VILLE</th><th>Control</th>
            </tr>
            <%
                List<User> users = mod.getUsers();
                for (User u : users) {%>
            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getLogin()%></td>
                <td><%=u.getEmail()%></td> 
                <td><%=u.getVille()%></td>
                <td>
                    <button class="edit">
                        <a  href="edit.jsp?id=<%=u.getId()%>">Edit</a>
                    </button>
                    <button class="delete">
                        <a  href="delete.jsp?id=<%=u.getId()%>">Delete</a>
                    </button>
                </td>
            </tr>
            <% }%>

        </table>
    </body>
</html>
