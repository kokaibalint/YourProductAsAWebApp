package com.codecool.servlet;

import com.codecool.model.User;
import com.codecool.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/email")
public class ProductServlet extends HttpServlet {

    public UserService service = UserService.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User > database = service.getUsers();
        req.setAttribute("list",database);
        RequestDispatcher rd = req.getRequestDispatcher("userdata.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email;
        email = req.getParameter("email");
        service.addUser(new User(email));
        doGet(req,resp);


    }
}
