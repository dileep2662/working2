import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Test extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		
		String name = request.getParameter("user");
		String password = request.getParameter("pass");
		
		out.println("<h1>User Name : "+name+"</h1>");
		out.println("<h1>Password : "+password+"</h1>");
		
			
	}
}
