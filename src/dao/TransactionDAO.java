package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Transaction;

public class TransactionDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public TransactionDAO(){}
	
	public Transaction getTransactionById(int id)
	{
		Session session = sessionFactory.openSession();
		Transaction buf =  (Transaction) session.get(Transaction.class, id);
		session.close();
		return buf;	
	}
}
