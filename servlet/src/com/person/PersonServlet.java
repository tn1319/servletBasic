package com.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String[] subject = request.getParameterValues("subject");;
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li>이름 : "+name+"<br>");
		if(gender.equals("0"))out.println("<li>성별 : 남<br>");
		else out.println("<li>성별 : 여<br>");
		out.println("<li>취미 : ");
		if(hobby==null)out.println("없음");
		else for(int i=0;i<hobby.length;i++)out.println(hobby[i]+" ");
		out.println("<br>");
		//out.println("<li>취미 : "+name+"<br>");
		out.println("<li>색깔 : ");
		if(color.equals("red"))out.println("빨강");
		else if(color.equals("green"))out.println("초록");
		else if(color.equals("blue"))out.println("파랑");
		else if(color.equals("magenta"))out.println("보라");
		else if(color.equals("cyan"))out.println("하늘");
		out.println("<br>");
		out.println("<li>과목 : ");
		for(int i=0;i<subject.length;i++)out.println(subject[i]+" ");
		out.println("<br>");out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
