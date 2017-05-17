package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(name+"의 나이는 "+age+"살 이므로 ");
		if(age>=19)out.println("<font color='red'>성인</font>입니다<br>");
		else out.println("<font color='blue'>청소년</font>입니다<br>");
		
		//out.println("<a href='http://localhost:8080/servlet/param/parameter.html'>뒤로</a>");
		out.println("<a href='javascript:history.go(-1)'>뒤로</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
