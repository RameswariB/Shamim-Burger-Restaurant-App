package com.shamim.java;

public class HealthyHamburguer {

	 private Addition add5;
     private Addition add6;
     private BasicHamburguer bh = new BasicHamburguer(); 

     public HealthyHamburguer(BasicHamburguer bh) { }

	public Addition getAdd5() {
		return add5;
	}

	public void setAdd5(Addition add5) {
		this.add5 = add5;
	}

	public Addition getAdd6() {
		return add6;
	}

	public void setAdd6(Addition add6) {
		this.add6 = add6;
	}

	private double GetTotal()
    {
        return bh.GetTotal() + (bh.add1 != null ? bh.add1.Price : 0) + (bh.add2 != null ? bh.add2.Price : 0) + (bh.add3 != null ? bh.add3.Price : 0) + (bh.add4 != null ? bh.add4.Price : 0) + (add5 != null ? add5.Price : 0) + (add6 != null ? add6.Price : 0);
    }

	@Override
	public String toString() {
		String message = "Basic hamburger on a {bh.Bread} with {bh.Meat}, price is {bh.BasePrice}\n";
        message += bh.add1 != null ? "Added {bh.add1.Name} for an extra {bh.add1.Price}\n" : "";
        message += bh.add2 != null ? "Added {bh.add2.Name} for an extra {bh.add2.Price}\n" : "";
        message += bh.add3 != null ? "Added {bh.add3.Name} for an extra {bh.add3.Price}\n" : "";
        message += bh.add4 != null ? "Added {bh.add4.Name} for an extra {bh.add4.Price}\n" : "";
        message += add5 != null ? "Added {add5.Name} for an extra {add5.Price}\n" : "";
        message += add6 != null ? "Added {add6.Name} for an extra {add6.Price}\n" : "";
        message += "Total Burger price is {GetTotal()}\n";
        return message;
	}
	
	
     
     
}
