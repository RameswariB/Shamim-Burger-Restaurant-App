package com.shamim.java;

import com.shamim.java.HamburguerFactory.IHamburguerBuilder;

public class BasicHamburguerBuilder implements IBasicHamburguerBuilder, IAddition1BH, IAddition2BH, IAddition3BH, IAddition4BH {
	  private BasicHamburguer bh;

        public BasicHamburguerBuilder(String bread, String meat, double price)
        {
            bh = new BasicHamburguer(bread, meat, price);
        }

        public static IBasicHamburguerBuilder Init(String bread, String meat, double price)
        {
            return new BasicHamburguerBuilder(bread, meat, price);
        }

        public IAddition1BH setAdd1(Addition add1)
        {
            bh.setAdd1(add1);
            return this;
        }

        public IAddition2BH setAdd2(Addition add2)
        {
            bh.setAdd2(add2);
            return this;
        }

        public IAddition3BH setAdd3(Addition add3)
        {
            bh.setAdd3(add3);
            return this;
        }

        public IAddition4BH setAdd4(Addition add4)
        {
            bh.setAdd4(add4);
            return this;
        }

        public BasicHamburguer build()
        {
            return bh;
        }
    
}
