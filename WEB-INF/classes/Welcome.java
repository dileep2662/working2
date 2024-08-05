import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.println("<h2>Welcome user</h2>");
		out.println("<h1>Login Successfully.</h1>");
			
		
		RequestDispatcher rd = request.getRequestDispatcher("Test");
		rd.include(request, response);
	
			
	}
}

