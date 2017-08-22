package service;

import dao.ClientDAO;
import domain.Client;

public class ClientService {
	private ClientDAO ClientDAO;

	public ClientDAO getClientDAO() {
		return ClientDAO;
	}

	public void setClientDAO(ClientDAO ClientDAO) {
		this.ClientDAO = ClientDAO;
	}

	public ClientService(ClientDAO ClientDAO)
	{
		this.setClientDAO(ClientDAO);
	}
	
	public ClientService(){}
	
	public Client getClientById(String id) {
		// TODO Auto-generated method stub
		
		return ClientDAO.getClientById(id);
	}
}
