import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;
//import java.util.*;
 
public class LoginServlet extends HttpServlet{
	public String message;
	public void init() throws ServletException{
		message="hello world servlet";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();

		out.println("<html>");
      	out.println("<head>");
      	out.println("<title> Hello World </title>");
      	out.println("<body>");
     	out.println("<h3>" + message+ "</h3>");
     	out.println("</body>");
        out.println("</html>");


	}
	public void destroy()
	{
		
	}
}