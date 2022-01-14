package com.shamim.java;

import com.shamim.java.HamburguerFactory.IHamburguerBuilder;

public interface IBasicHamburguerBuilder extends IHamburguerBuilder {


    IAddition1BH setAdd1(Addition add1);
    BasicHamburguer build();
}
