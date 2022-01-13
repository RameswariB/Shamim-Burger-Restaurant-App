package com.shamim.java;

public class BasicHamburguer {

	
	protected String bread;
    protected String meat;
    protected double basePrice;

    protected Addition add1;
    protected Addition add2;
    protected Addition add3;
    protected Addition add4;
    protected Addition add7;
    
    public BasicHamburguer() { }

    public BasicHamburguer(String bread, String meat, double price)
    {
        this.bread = bread;
        this.meat = meat;
        basePrice = price;
    }

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public Addition getAdd1() {
		return add1;
	}

	public void setAdd1(Addition add1) {
		this.add1 = add1;
	}

	public Addition getAdd2() {
		return add2;
	}

	public void setAdd2(Addition add2) {
		this.add2 = add2;
	}

	public Addition getAdd3() {
		return add3;
	}

	public void setAdd3(Addition add3) {
		this.add3 = add3;
	}

	public Addition getAdd4() {
		return add4;
	}

	public void setAdd4(Addition add4) {
		this.add4 = add4;
	}

	public Addition getAdd7() {
		return add7;
	}

	public void setAdd7(Addition add7) {
		this.add7 = add7;
	}
    
	 public double GetTotal()
     {
         return basePrice + (add1 != null ? add1.Price : 0) + (add2 != null ? add2.Price : 0) + (add3 != null ? add3.Price : 0) + (add4 != null ? add4.Price : 0);
     }

	 
     @Override
	public String toString() {

    	 String message = "Basic hamburger on a {bread} with {meat}, price is {basePrice}\n";
         message += add1 != null ? "Added {add1.Name} for an extra {add1.Price}\n" : "";
         message += add2 != null ? "Added {add2.Name} for an extra {add2.Price}\n" : "";
         message += add3 != null ? "Added {add3.Name} for an extra {add3.Price}\n" : "";
         message += add4 != null ? "Added {add4.Name} for an extra {add4.Price}\n" : "";
         message += "Total Burger price is {GetTotal()}\n";
         return message;
     }

}
