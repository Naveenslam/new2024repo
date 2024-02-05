 package logValidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.ValidateUserInfo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginValidation extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		RequestDispatcher rd;

		PrintWriter pw = response.getWriter();
		
		
		//12/29/2023 new data retrieve method from db
		
		ValidateUserInfo vul= new ValidateUserInfo();
		
		try {
			
			if(vul.userCheck(username, password)) {
				
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				
				response.sendRedirect("home");
				
			}
			else {
				
				rd=request.getRequestDispatcher("index.html");
				rd.include(request, response);
				pw.println("<h1>Invalid</h1><br>");			
							
		
			}
		}
		
		catch (Exception e){
			
			
		}
		
		//12/29/2023 new data retrieve method from db end
		
		
		
		
		
		
		
		
		
		

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Class.forName("com.mysql.jdbc.Driver");

			// xe //jdbc:mysql://localhost:3306/sonoo

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521: ", "hr", "admin");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from REGISTERUSERS");

			while (rs.next())

			{

				String expectedUser = rs.getString(1);

				String expectedPwd = rs.getString(2);

				if (username.equals(expectedUser) && password.equals(expectedPwd)) {

					// Cookie cookie=new Cookie("user", username);

					// response.addCookie(cookie);

					rd = request.getRequestDispatcher("home?user=" + username);

					rd.forward(request, response);
					
					pw.println("<h1>Valid user login successfully</h1><br>");
					

				} else {

					rd = request.getRequestDispatcher("index.html");

					rd.include(request, response);

					pw.println("<h1>Invalid</h1><br>");
//
//					ServletContext sc = getServletContext();
//
//					String driver = sc.getInitParameter("user");
//
//					pw.println("<h2>" + driver + "</h2>");

				}

			}

			con.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e)

		{

			e.printStackTrace();

		}

	}

}

//	
//	String username=request.getParameter("username");
//    String password=request.getParameter("password");
//
//    RequestDispatcher rd;
//
//    PrintWriter pw = response.getWriter();
//	
//	try {
//		  Class.forName("oracle.jdbc.driver.OracleDriver");
//		
//		
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","HR","admin");
//			
//			  Statement st=con.createStatement();
//
//			  ResultSet rs=st.executeQuery("select * from REGISTERUSERS");
//			  
//			  while(rs.next())
//
//			  {
//				  
//
//				  String expectedUser = rs.getString(1);
//
//				  String expectedPwd = rs.getString(2);
//
//
////			  System.out.println("UserName: "+rs.getString(1)+", Password: "+rs.getInt(2));
//
//			  }
//			  
//			
//			if (username.equals(expectedUser) && password.equals(expectedPwd)) {
//
//				   //Cookie cookie=new Cookie("user", username);
//
//				   //response.addCookie(cookie);
//
//				   rd = request.getRequestDispatcher("home?user="+username);
//
//				   rd.forward(request, response);
//
//				  } else {
//
//				   rd = request.getRequestDispatcher("index.html");
//
//				   rd.include(request, response);
//
//				   pw.println("<h1>Invalid</h1><br>");
//
//				   ServletContext sc=getServletContext();
//
//				   String driver=sc.getInitParameter("user");
//
//				   pw.println("<h2>"+driver+"</h2>");
//
//				  }
//
//	
//
//				  con.close();
//
//			
//		} catch (Exception e) {
//		
//			e.printStackTrace();
//		}
//}
//}
//

//	RequestDispatcher rd;
//	PrintWriter pw = response.getWriter();

//	Class.forName("oracle.jdbc.driver.OracleDriver");

//	if(username.equals("admin") && password.equals("123456"))
//	{
//		Cookie cookie = new Cookie("user",username);
//		response.addCookie(cookie);
//		
//	    rd=request.getRequestDispatcher("home");
//	    rd.forward(request, response);
//		
////		HttpSession session = request.getSession();
//	}
//	else
//	{
//		PrintWriter pw=response.getWriter();
//		rd=request.getRequestDispatcher("index.html");
//		rd.include(request, response);		
//		pw.println("<h1>invalid</h1>");
//	}
//	
//}
//
//
//}
