package com.shamim.java;

public class DeluxeHamburguerBuilder implements IDeluxeHamburguerBuilder {

	private DeluxeHamburguer dh;
    private BasicHamburguer bh;

    public DeluxeHamburguerBuilder(String bread, String meat, double price)
    {
        bh = new BasicHamburguer(bread, meat, price);
        bh.setAdd1(new Addition("Chips", 2.75));
        bh.setAdd2(new Addition("Drink", 1.81));
        dh = new DeluxeHamburguer(bh);

    }

    public static IDeluxeHamburguerBuilder Init(String bread, String meat, double price)
    {
        return new DeluxeHamburguerBuilder(bread, meat, price);
    }

    public DeluxeHamburguer build()
    {
        return dh;
    }
    
}
