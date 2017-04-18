import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		String message = "Invalid User";

		String username = "";
		String password = "";
		
		if (request.getParameter("username").isEmpty() || request.getParameter("username")==null){
			username = request.getParameter("username");
		}else{
			username = "none";
		}
		 
		if (request.getParameter("password").isEmpty() || request.getParameter("password")==null){
			password = request.getParameter("password");
		}else{
			password = "none";
		}
		 

		if (username.trim().length()==0)
			username = "no user entered";
		if (password.trim().length()==0)
			password = "no password entered";
		
		DataAccess da = new DataAccess();
		da.setUsername(username);
		da.setPassword(password);
		if (da.IsValidUser()){
			message = username + " is a Valid user";
		}
		out.println("<h1>" + message + "</h1>"); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}


}
