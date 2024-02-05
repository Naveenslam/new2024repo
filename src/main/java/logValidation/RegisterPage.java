package logValidation;

import java.io.IOException;

import com.util.ConnectionDB;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	
	@WebServlet(urlPatterns = "/register")
	public class RegisterPage extends HttpServlet {

	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

	 String username=request.getParameter("username");

	 String password=request.getParameter("password");

//	 String email=request.getParameter("email");

	 ConnectionDB cdb=new ConnectionDB();

	 cdb.insertNewUser(username,password);

	 response.sendRedirect("index.html");

	 }

	}


