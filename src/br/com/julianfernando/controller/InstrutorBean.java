package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.models.Instrutor;

@ManagedBean
public class InstrutorBean {
	
	private Instrutor instrutor = new Instrutor();
	
	private List<Instrutor> instrutors = new ArrayList<Instrutor>();

	public InstrutorBean() {
		super();
		// instrutor Maria Inês Cardoso Cambraia
		instrutor.setNome("Maria Inês Cardoso Camrbraia");
		instrutor.setDataDeNascimento("18/05/1964");
		
		// instrutor Julian Fernando de Almeida Cambraia
		Instrutor instrutor_1 = new Instrutor();
		
		instrutor_1.setNome("Julian Fernando de Almeida Cambraia");
		instrutor_1.setDataDeNascimento("08/11/1970");
		
		instrutors.add(instrutor);
		instrutors.add(instrutor_1);
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public List<Instrutor> getInstrutors() {
		return instrutors;
	}
	
	

}
