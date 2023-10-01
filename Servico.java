package br.com.belasUnhas;

public class Servico {
	
	private String nome;
	private String telefone;
	private String horario;
	private String data;
	private String descricao;
	
	/**
	 * @param nome
	 * @param telefone
	 * @param horario
	 * @param data
	 * @param descricao
	 */
	public Servico(String nome, String telefone, String horario, String data, String descricao) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.horario = horario;
		this.data = data;
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "nome: " + nome + "\n" + 
			   "telefone: " + telefone + "\n" + 
			   "horario: " + horario + "\n" + 
			   "data: " + data + "\n" +
			   "descricao: " + descricao;
	}


	public Servico() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
