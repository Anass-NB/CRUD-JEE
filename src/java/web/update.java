package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.User;
import metier.UserImp;

@WebServlet("/update")
public class update extends HttpServlet {

    private UserImp userimp;

    @Override
    public void init() {
        userimp = new UserImp();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(Integer.parseInt(request.getParameter("id")));
        user.setLogin(request.getParameter("login"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setVille(request.getParameter("ville"));
        userimp.UpdateUser(user);
                 //request.setAttribute("myuser", user1);
       //  request.getRequestDispatcher("userUpdated.jsp").forward(request, response);

        response.sendRedirect("allusers");

    }

}
