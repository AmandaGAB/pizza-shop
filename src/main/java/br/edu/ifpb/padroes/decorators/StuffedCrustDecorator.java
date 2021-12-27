package br.edu.ifpb.padroes.decorators;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends PizzaDecorator{

    public StuffedCrustDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName() + " (stuffed crust)";
    }

    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice()* 1.20f;
    }
    
}
