import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("user");
		String password = request.getParameter("pass");
			
			
		out.println("<html><body><center>");
		out.println("<header style= ' background-color: #346648 ; position: fixed; top:0px; height: 80px;width: 100%;'><h1 style='font-size: 30px; color: white;text-align: center; '>Header</h1></header>");
		out.println("<form style = 'padding:80px' method = 'post'> ");
		if(password.equals("123") && name.equals("dileep"))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.include(request, response);
		}
		else
		{
			out.println("<font color='red'><b>You have entered incorrect password</b></font>");
			RequestDispatcher rd = request.getRequestDispatcher("/alter.html");
			rd.include(request, response);
			
		}
		out.println("</form><footer style='background-color:#377c97d6; width: 100%; text-align: center; position: fixed;bottom: 0px;border-radius:25px;'><h3>Footer</h3></footer> ");
		out.println("</center></body></html>");
		
	}
}
