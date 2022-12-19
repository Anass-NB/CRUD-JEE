package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.User;
import metier.UserImp;

@WebServlet("/add")
public class addServlet extends HttpServlet {

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
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setVille(request.getParameter("ville"));
        User us1 = userimp.addUser(user);

        // request.getRequestDispatcher("allusersView.jsp").forward(request,response);
        response.sendRedirect("allusers");

        // response.sendRedirect("allusersView.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("allusers");

    }

}
