package br.com.belasUnhas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class NovoServico
 */
@WebServlet("/NovoServico")
public class NovoServico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NovoServico() {
        super();
        // TODO Auto-generated constructor stub
    }
    Agenda agenda = new Agenda();
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = (String) req.getParameter("nome");
		String fone = (String) req.getParameter("fone");
		String horario = (String) req.getParameter("horario");
		String data = (String) req.getParameter("data");
		String descricao = (String) req.getParameter("descricao");
		
		Servico nServ = new Servico();
		nServ.setNome(nome);
		nServ.setTelefone(fone);
		nServ.setData(data);
		nServ.setDescricao(descricao);
		nServ.setHorario(horario);
		
		
		//Salvando os agendamentos em txt
		System.out.print(nServ + "\n");
		FileWriter arq = new FileWriter("C:\\Users\\LUAN\\eclipse-workspace\\belasUnhas\\src\\main\\webapp\\agendados.txt", true);
	    PrintWriter gravarArq = new PrintWriter(arq);
	    gravarArq.append(nServ + "\n" + "\n");
	    arq.close();
	    System.out.print("arquivo gravado");
	    //Salvando os agendamentos
		
		//Agenda agenda = new Agenda();
		agenda.adiciona(nServ);

		//chamar o JSP = NovaEmpresaCriada.jsp
		RequestDispatcher rd = 
				req.getRequestDispatcher("/agendar.jsp");
		req.setAttribute("nome", nome);
		rd.forward(req, resp);
		
		
	}
}
