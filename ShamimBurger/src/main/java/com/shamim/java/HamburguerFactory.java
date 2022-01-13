package com.shamim.java;


public class HamburguerFactory {
	 public interface IHamburguerBuilder 
	 {
     }

	 public HamburguerFactory()
     {
     }
	 public IHamburguerBuilder CreateHamburguer(HamburguerType type, String bread, String meat, double price)
     {
         switch (type)
         {
             case Basic:
                 return BasicHamburguerBuilder.Init(bread, meat, price);
             case Healthy:
                 return HealthyHamburguerBuilder.Init(meat, price);
             case Delux:
                 return DeluxeHamburguerBuilder.Init(bread, meat, price);
             default:
                 return null;
         }
     }
}
