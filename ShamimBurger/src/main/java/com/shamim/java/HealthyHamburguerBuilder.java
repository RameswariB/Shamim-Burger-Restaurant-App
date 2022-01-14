package com.shamim.java;

public class HealthyHamburguerBuilder implements IHealthyHamburguerBuilder, IAddition1HH, IAddition2HH, IAddition3HH, IAddition4HH, IAddition5HH, IAddition6HH
{
    private HealthyHamburguer hh;
    private BasicHamburguer bh;
    public HealthyHamburguerBuilder(String meat, double price)
    {
        bh = new BasicHamburguer("Brown rye roll", meat, price);
        hh = new HealthyHamburguer(bh);
    }

    public static IHealthyHamburguerBuilder Init(String meat, double price)
    {
        return new HealthyHamburguerBuilder(meat, price);
    }

    public IAddition1HH setAdd1(Addition add)
    {
        bh.setAdd1(add);
        return this;
    }

    public IAddition2HH setAdd2(Addition add)
    {
        bh.setAdd2(add);
        return this;
    }

    public IAddition3HH setAdd3(Addition add)
    {
        bh.setAdd3(add);
        return this;
    }

    public IAddition4HH setAdd4(Addition add)
    {
        bh.setAdd4(add);
        return this;
    }

    public IAddition5HH setAdd5(Addition add)
    {
        hh.setAdd5(add);
        return this;
    }

    public IAddition6HH setAdd6(Addition add)
    {
        hh.setAdd6(add);
        return this;
    }

    public HealthyHamburguer build()
    {
        return hh;
    }
}
