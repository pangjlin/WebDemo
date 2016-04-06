package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class webservlet
 */
@WebServlet("/webservlet")
public class webservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public String getData() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello~First Servlet!中文");
        return sb.toString();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = this.getData();
        response.setContentType("text/html;charset=UTF-8");
        response.getOutputStream().write(data.getBytes("UTF-8"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
        IOException {
        //        String data = this.getData();
        //        response.setContentType("text/html;charset=UTF-8");
        //        response.getOutputStream().write(data.getBytes("UTF-8"));
        this.doGet(request, response);
    }

}
