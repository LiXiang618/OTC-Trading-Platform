package domain;

import java.io.Serializable;
import java.util.Map;

public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private int cash;
	private Map<String,Integer> stock;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public Map<String,Integer> getStock() {
		return stock;
	}
	public void setStock(Map<String,Integer> stock) {
		this.stock = stock;
	}
	
}
