package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<html><body><h1>Olá Mundo</h1></body></html>");

		String p1 = req.getParameter("nome");

		if (p1.trim().length() == 0) {
			req.getRequestDispatcher("index.jsp?erro=ERRO: NOME INEXISTENTE!").forward(req, resp);

		} else {
			req.getRequestDispatcher("benvindo.jsp?nome=" + p1.toUpperCase()).forward(req, resp);
		}
	}
}
