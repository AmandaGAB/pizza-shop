package br.edu.ifpb.padroes.decorators;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCuponDecorator extends PizzaDecorator{

    public DiscountCuponDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice()*0.25f;
    }

   

    
    
}
