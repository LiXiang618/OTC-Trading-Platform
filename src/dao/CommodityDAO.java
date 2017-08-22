package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Commodity;

public class CommodityDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public CommodityDAO(){}
	
	public Commodity getCommodityById(String id)
	{
		Session session = sessionFactory.openSession();
		Commodity buf =  (Commodity) session.get(Commodity.class, id);
		session.close();
		return buf;	
	}
}
