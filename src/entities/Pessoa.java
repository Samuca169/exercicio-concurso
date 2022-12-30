package entities;

public class Pessoa {

	private String nome;
	private Double primeiraNota;
	private Double segundaNota;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Double primeiraNota, Double segundaNota) {
		this.nome = nome;
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrimeiraNota() {
		return primeiraNota;
	}

	public void setPrimeiraNota(Double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public Double getSegundaNota() {
		return segundaNota;
	}

	public void setSegundaNota(Double segundaNota) {
		this.segundaNota = segundaNota;
	}
}
