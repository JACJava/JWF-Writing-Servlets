package com.mantiso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")

public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        //resp.getWriter().write("Hello World Julie");

        if(name != null) {
            resp.setContentType("text/xml");
            resp.getWriter().printf("<name>Hello %s</name>", name);
        } else {
            resp.getWriter().write("Please enter a valid name");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        //resp.getWriter().write("Hello World Julie");

        if(name != null && name != "") {
            resp.getWriter().printf("Hello %s", name);
        } else {
            //resp.getWriter().write("Please enter a valid name");
            resp.sendRedirect("index.jsp");
        }
    }







}
