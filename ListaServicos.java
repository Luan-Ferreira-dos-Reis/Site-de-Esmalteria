package br.com.belasUnhas;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ListaServicos
 */
@WebServlet("/ListaServicos")
public class ListaServicos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaServicos() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Agenda listaServicos = new Agenda();
		List<Servico> lista = listaServicos.getServicosAgendados();
		
		RequestDispatcher rd = 
				req.getRequestDispatcher("/agendamento.jsp");
		req.setAttribute("listaServicos", lista);
		rd.forward(req, resp);
	}

}
