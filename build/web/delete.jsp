<%-- 
    Document   : delete
    Created on : Dec 18, 2022, 2:37:40 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete </title>
        <style>
            body {
                    font-size: 32px;
            }
            input , button>a , button {
                padding: 10px;
                color: black;
                font-weight: bold;
                text-decoration: none;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <form action="delete" method="post">
            <h2>Do you want delete this client</h2>
            <input type="hidden" name="id" value="<%= request.getParameter("id")%>">
            <div>
                <label>Confirm </label>
                <input type="submit" style="background: greenyellow" value="Yes">
                <label>Cancel </label>
                <button  style="background: red"><a href="allusers">Cancel</a></button>

            </div>

        </form>
    </body>
</html>
