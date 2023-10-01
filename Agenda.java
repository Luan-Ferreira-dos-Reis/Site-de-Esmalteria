package br.com.belasUnhas;

import java.util.ArrayList;
import java.util.List;


public class Agenda {

	public static List<Servico> agendados = new ArrayList<Servico>();
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	
	public void adiciona(Servico novoServico) {
		agendados.add(novoServico);

	}

	public List<Servico> getServicosAgendados() {
		return Agenda.agendados ;
	}

}
