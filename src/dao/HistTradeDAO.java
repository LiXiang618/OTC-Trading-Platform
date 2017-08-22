package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.HistTrade;

public class HistTradeDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public HistTradeDAO(){}
	
	public HistTrade getHistTradeById(int id)
	{
		Session session = sessionFactory.openSession();
		HistTrade buf =  (HistTrade) session.get(HistTrade.class, id);
		session.close();
		return buf;	
	}
}
