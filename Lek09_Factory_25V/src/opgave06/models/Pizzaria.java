package opgave06.models;

import opgave06.models.factories.SimplePizzaFactory;
import opgave06.models.pizza.Pizza;

public class Pizzaria {
    SimplePizzaFactory pizzaFactory;

    public Pizzaria(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type, String style) {
        Pizza pizza = pizzaFactory.createPizza(type, style);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
