package service;

import dao.BrokerDAO;
import domain.Broker;

public class BrokerService {
	private BrokerDAO brokerDAO;

	public BrokerDAO getBrokerDAO() {
		return brokerDAO;
	}

	public void setBrokerDAO(BrokerDAO brokerDAO) {
		this.brokerDAO = brokerDAO;
	}

	public BrokerService(BrokerDAO brokerDAO)
	{
		this.setBrokerDAO(brokerDAO);
	}
	
	public BrokerService(){}
	
	public Broker getBrokerById(String id) {
		// TODO Auto-generated method stub
		
		return brokerDAO.getBrokerById(id);
	}
}
