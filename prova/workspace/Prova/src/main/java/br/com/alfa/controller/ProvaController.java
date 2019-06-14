package br.com.alfa.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.alfa.dao.ProvaDAO;
import br.com.alfa.dao.ProvaDAOImp;
import br.com.alfa.model.Prova;

@ManagedBean
@SessionScoped
public class ProvaController {
	
	private Prova prova;
	
	private DataModel<Prova> listaProvas;

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}
	
	public String prepararAdicionarProva() {
		prova = new Prova();
		return "gerenciarProva";
	}
	
	public String editar(Prova prova) {
	   this.prova = prova; 
	   return "gerenciarProva"; 
	}
	
	public DataModel<Prova> getListarProvas(){
		List<Prova> lista = new ProvaDAOImp().list();
		listaProvas = new ListDataModel<Prova>(lista);
		return listaProvas;
	}
	
	public String excluirProva(Prova prova) {
		ProvaDAO dao = new ProvaDAOImp();
		dao.remove(prova);
		return "index";
	}
	public float CalculoImc(float peso, float altura){

		float imc;
		imc=(peso)/(altura*altura);
		
		return imc ;

		}
	public String adicionarProva() {
		ProvaDAO dao = new ProvaDAOImp();
		dao.save(prova);
		return "index";
	}
	
	public String alterarProva() {
		ProvaDAO dao = new ProvaDAOImp();
		dao.update(prova);
		return "index";
	}
	
	
	public String home(){
		return "index";
	}
}






