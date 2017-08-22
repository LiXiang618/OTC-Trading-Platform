package service;

import dao.TransactionDAO;
import domain.Transaction;

public class TransactionService {
	private TransactionDAO TransactionDAO;

	public TransactionDAO getTransactionDAO() {
		return TransactionDAO;
	}

	public void setTransactionDAO(TransactionDAO TransactionDAO) {
		this.TransactionDAO = TransactionDAO;
	}

	public TransactionService(TransactionDAO TransactionDAO)
	{
		this.setTransactionDAO(TransactionDAO);
	}
	
	public TransactionService(){}
	
	public Transaction getTransactionById(int id) {
		// TODO Auto-generated method stub
		
		return TransactionDAO.getTransactionById(id);
	}
}
