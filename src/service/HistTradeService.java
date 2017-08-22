package service;

import dao.HistTradeDAO;
import domain.HistTrade;

public class HistTradeService {
	private HistTradeDAO HistTradeDAO;

	public HistTradeDAO getHistTradeDAO() {
		return HistTradeDAO;
	}

	public void setHistTradeDAO(HistTradeDAO HistTradeDAO) {
		this.HistTradeDAO = HistTradeDAO;
	}

	public HistTradeService(HistTradeDAO HistTradeDAO)
	{
		this.setHistTradeDAO(HistTradeDAO);
	}
	
	public HistTradeService(){}
	
	public HistTrade getHistTradeById(int id) {
		// TODO Auto-generated method stub
		
		return HistTradeDAO.getHistTradeById(id);
	}
}
