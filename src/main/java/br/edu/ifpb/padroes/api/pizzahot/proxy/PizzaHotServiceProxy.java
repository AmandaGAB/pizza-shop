package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {

    private PizzaHotService pizzaHotService;
    List<PizzaHotPizza> cacheall = new ArrayList<>();

    public void PizzaHotCacheProxy(){
        this.pizzaHotService = new PizzaHotServiceImpl();
    }

    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if(cacheall.isEmpty()){
            cacheall = pizzaHotService.getPizzas();
        }else{
            System.out.println("Lista recuperada do cache");
        }
        return cacheall;
    }
}
