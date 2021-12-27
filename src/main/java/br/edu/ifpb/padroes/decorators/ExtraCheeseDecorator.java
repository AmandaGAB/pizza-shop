package br.edu.ifpb.padroes.decorators;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator {

    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice()* 1.10f;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName() + " (extra cheese)";
    }
    
}
