package com.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("janet") && password.equals("password123")) {
			response.sendRedirect("SuccessServlet?user1="+username);
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("<html><head>");
			out.print("<title< My First Servlet </title>");
			out.print("</head>");
			out.print("<body>");
			out.print("The entered credentials do not match");
			out.print("</body><html>");
		}
	}
}
