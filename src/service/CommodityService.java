package service;

import dao.CommodityDAO;
import domain.Commodity;

public class CommodityService {
	private CommodityDAO CommodityDAO;

	public CommodityDAO getCommodityDAO() {
		return CommodityDAO;
	}

	public void setCommodityDAO(CommodityDAO CommodityDAO) {
		this.CommodityDAO = CommodityDAO;
	}

	public CommodityService(CommodityDAO CommodityDAO)
	{
		this.setCommodityDAO(CommodityDAO);
	}
	
	public CommodityService(){}
	
	public Commodity getCommodityById(String id) {
		// TODO Auto-generated method stub
		
		return CommodityDAO.getCommodityById(id);
	}
}
