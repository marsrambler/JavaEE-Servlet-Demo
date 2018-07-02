package com.jack.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		System.out.println("yiz get: " + req.getQueryString());
		genResponse(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		System.out.println("yiz post: " + req.getQueryString());
		genResponse(req, resp);
	}
	
	private void genResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		request.setCharacterEncoding("UTF-8");  
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		if("login_input".equals(action)) {  
			request.getRequestDispatcher("login.jsp").forward(request , response);  
		} else if("login".equals(action)) {  
			String name = request.getParameter("name");  
			String password = request.getParameter("password"); 
			System.out.println("name->" + name + ",password->" + password);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("Rest.html");
			view.forward(request, response);
		}
		*/
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(
           "<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Ó^¿´¾€ÉÏ•ø»`</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table style=\"text-align: left; width: 100%;\" border=\"0\" >");
        out.println("  <tbody>");
        out.println("  <tr>");
        out.println("  <td style=\"background-color: rgb(51, 255, 255);\">¾Wí“</td>");
        out.println("  <td style=\"background-color: rgb(51, 255, 255);\">·Öî</td>");
        out.println("  </tr>");
        out.println("  </tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");		
	}	
}
