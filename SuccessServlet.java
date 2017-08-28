package com.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user1");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("<title< My First Servlet </title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hi Welcome " + username + "</h1>");
		out.print("</body><html>");
	}

}
