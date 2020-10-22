import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ola-mundo")
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<h1>ALO MUNDO</h1>");
		out.print("<p>Este é o meu primeiro servlet</p>");
		
		String p1 = req.getParameter("nome");
		
		//RequestDispatcher rd = null;
		if(p1.trim().length()==0) {
			req.getRequestDispatcher("index.jsp?erro=ERRO NO NOME").forward(req, resp);
			
		//	out.println("<b>Invalid Login Info.</b><br>");
         //           rd = req.getRequestDispatcher("/ola-mundo.jsp");
            //        rd.include(req, resp);
		}
		else {
			req.getRequestDispatcher("benvindo.jsp?nome=" + p1.toUpperCase()).forward(req, resp);
		}
		
	}
}
