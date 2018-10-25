package com.jack.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServletDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		org.apache.log4j.Logger log4jLogger = org.apache.log4j.Logger.getLogger(ServletDemo.class);
		log4jLogger.info("get: " + req.getQueryString());
		genResponse(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		Logger logger = LoggerFactory.getLogger(ServletDemo.class);		
		org.apache.log4j.Logger log4jLogger = org.apache.log4j.Logger.getLogger(ServletDemo.class);
		logger.info("post: " + req.getQueryString());
		genResponse(req, resp);
	}

	private void genResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * request.setCharacterEncoding("UTF-8");
		 * response.setContentType("text/html;charset=utf-8"); String action =
		 * request.getParameter("action"); if("login_input".equals(action)) {
		 * request.getRequestDispatcher("login.jsp").forward(request ,
		 * response); } else if("login".equals(action)) { String name =
		 * request.getParameter("name"); String password =
		 * request.getParameter("password"); System.out.println("name->" + name
		 * + ",password->" + password); } else { RequestDispatcher view =
		 * request.getRequestDispatcher("Rest.html"); view.forward(request,
		 * response); }
		 */
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>�^�����ϕ��`</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table style=\"text-align: left; width: 100%;\" border=\"0\" >");
		out.println("  <tbody>");
		out.println("  <tr>");
		out.println("  <td style=\"background-color: rgb(51, 255, 255);\">�W�</td>");
		out.println("  <td style=\"background-color: rgb(51, 255, 255);\">���</td>");
		out.println("  </tr>");
		out.println("  </tbody>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}
