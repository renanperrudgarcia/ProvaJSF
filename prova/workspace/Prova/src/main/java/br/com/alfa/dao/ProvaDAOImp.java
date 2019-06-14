package br.com.alfa.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.alfa.model.Prova;
import br.com.alfa.util.HibernateUtil;

public class ProvaDAOImp implements ProvaDAO {

	@Override
	public void save(Prova prova) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(prova);
		t.commit();
		
	}

	@Override
	public Prova getProva(Long codigo) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		
		return (Prova) session.load(Prova.class, codigo);//ou criar a query
	}

	@Override
	public void remove(Prova prova) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(prova);
		t.commit();
		
	}

	@Override
	public void update(Prova prova) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(prova);
		t.commit();
		
	}

	@Override
	public List<Prova> list() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction t = session.beginTransaction();
		List<Prova> lista = session.createQuery("from Prova").list();
		t.commit();
		return lista;
	}

}
