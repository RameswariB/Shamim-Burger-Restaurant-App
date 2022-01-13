package com.shamim.java;

public class Addition {
	
	public String Name;
	public double Price;
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}


	public Addition(String name, double price)
    {
        Name = name;
        Price = price;
    }

}
