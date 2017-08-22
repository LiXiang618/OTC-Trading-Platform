package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Client;

public class ClientDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public ClientDAO(){}
	
	public Client getClientById(String id)
	{
		Session session = sessionFactory.openSession();
		Client buf =  (Client) session.get(Client.class, id);
		session.close();
		return buf;	
	}
}
