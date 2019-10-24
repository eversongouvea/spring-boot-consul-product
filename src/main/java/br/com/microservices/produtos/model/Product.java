package br.com.microservices.produtos.model;

public class Product {

	private String name;
	
	private String descript;
	
	private double amount;
	
	public Product() {}
	
	public Product(String name, String descript, double amount, int qtd) {
		this.name = name;
		this.descript = descript;
		this.amount = amount;
		this.qtd = qtd;
	}
	
	private int qtd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	

	
	
	
	
}
