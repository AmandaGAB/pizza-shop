package br.edu.ifpb.padroes.decorators;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends PizzaDecorator{

    PanPizzaDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName() + " (pan pizza)";
    }

    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice()* 1.15f;
    }
    
}
