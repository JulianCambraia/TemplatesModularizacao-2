package br.com.julianfernando.models;

public class Produto {

	private Long id;
	
	public Produto(Long id, String nome, String caminhoDaImagem, Double preco, String detalhes) {
		super();
		this.id = id;
		this.nome = nome;
		this.caminhoDaImagem = caminhoDaImagem;
		this.preco = preco;
		this.detalhes = detalhes;
	}

	private String nome;
	
	private String caminhoDaImagem;
	
	private Double preco;
	
	private String detalhes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getCaminhoDaImagem() {
		return caminhoDaImagem;
	}

	public void setCaminhoDaImagem(String caminhoDaImagem) {
		this.caminhoDaImagem = caminhoDaImagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
