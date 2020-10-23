import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/gerador-de-numeros")
public class GeradorDeNumeros extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	Random gerador = new Random();
	out.print("<h1>Gerador de Número Randomico</h1>");
	out.print(gerador.nextInt(100));
	
	}
	
}
