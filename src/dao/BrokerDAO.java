package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Broker;

public class BrokerDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}  
	
	public BrokerDAO(){}
	
	public Broker getBrokerById(String id)
	{
		Session session = sessionFactory.openSession();
		Broker buf =  (Broker) session.get(Broker.class, id);
		session.close();
		return buf;	
	}
}
