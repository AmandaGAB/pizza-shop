package br.edu.ifpb.padroes.decorators;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaDecorator implements Pizza{

    private Pizza wrappee;


    PizzaDecorator(Pizza pizza) {
        this.wrappee = pizza;
    }


    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return this.wrappee.getPrice();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.wrappee.getName();
    }

}