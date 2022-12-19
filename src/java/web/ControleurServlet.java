package web;

import com.sun.tools.javac.resources.CompilerProperties;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.User;
import metier.UserImp;

//@WebServlet(name="ControleurServlet",urlPatterns={"/allusers"})
public class ControleurServlet extends HttpServlet {

    private UserImp users;

    @Override
    public void init() {
        users = new UserImp();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserModele user = new UserModele();
        List<User> all_users = users.gettAllUsers();
        user.setUsers(all_users);

        request.setAttribute("modele", user);
        request.getRequestDispatcher("allusersView.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);

    }

    
    
    
}
