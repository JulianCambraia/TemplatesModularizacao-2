package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.models.Produto;

@ManagedBean
public class ProdutoBean {

	private Produto produtoSelecionado;
	
	private Long idDoProdutoSelecionado;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ProdutoBean() {
		super();
		this.produtos.add(new Produto(1L, "Celular Samsung Galaxy", "/resources/images/celular.jpg", 1250.00, "Smartphone Tela de 5.2 polegadas, Core 2 DUO 1.800 MHz"));
		this.produtos.add(new Produto(2L, "Semp Toshiba", "/resources/images/televisor.jpg", 3250.00,"Televisão 42 polegadas Semp Toshiba LED 1080p Full HD High Definition"));
		
		this.produtoSelecionado = this.produtos.get(0);
		
	}

	public Long getIdDoProdutoSelecionado() {
		return idDoProdutoSelecionado;
	}

	public void setIdDoProdutoSelecionado(Long idDoProdutoSelecionado) {
		this.idDoProdutoSelecionado = idDoProdutoSelecionado;
	}


	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void carregaProdutoSelecionado() {
		
		for (Produto produto : produtos) {
			if (this.idDoProdutoSelecionado==produto.getId()) {
				this.produtoSelecionado = produto;
				break;
			}
		}
	}
}
