package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()...");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()...");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet()...");
		
		
		//����
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Servlet!!<br>");
		out.println("�ȳ��ϼ���!!<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
