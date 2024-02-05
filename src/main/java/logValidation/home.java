package logValidation;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class home extends HttpServlet{
	

	public void service (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		
		
	
		String username="";
//		
//		Cookie[] cookies=request.getCookies();
//		
//		for(Cookie c:cookies) {
//			
//			if(c.getName().equals("user")) {
//				
//				username=c.getValue();
//		
//			
//			
//		}
//			ServletConfig sc=getServletConfig();
			
			
			
//			sc.getContext(driver);

		RequestDispatcher rd = request.getRequestDispatcher("homePage.html");
		PrintWriter pw = response.getWriter();
		rd.include(request, response);
		pw.println("<h2>" + username + "</h2>");

	}

	}




