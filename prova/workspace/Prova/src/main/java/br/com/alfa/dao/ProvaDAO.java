package br.com.alfa.dao;

import java.util.List;

import br.com.alfa.model.Prova;

public interface ProvaDAO {
	
	public void save(Prova prova);
	public Prova getProva(Long codigo);
	public void remove(Prova prova);
	public void update(Prova prova);
	public List<Prova> list();

}
