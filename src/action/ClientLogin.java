package action;

import service.ClientService;

import com.opensymphony.xwork2.ActionSupport;

public class ClientLogin extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClientService clientService;
	
	public ClientLogin(){}
	
	public String execute()
	{
		
		
		return SUCCESS;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

}
