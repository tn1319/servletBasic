package com.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x=Integer.parseInt(request.getParameter("x"));
		int y=Integer.parseInt(request.getParameter("y"));
		
		response.setContentType("text/html; chartype=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(x+" + "+y+" = "+(x+y)+"<br>");
		out.println(x+" - "+y+" = "+(x-y)+"<br>");
		out.println(x+" * "+y+" = "+(x*y)+"<br>");
		out.println(x+" / "+y+" = "+(1.*x/y)+"<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
