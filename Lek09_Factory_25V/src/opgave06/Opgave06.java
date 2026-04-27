package opgave06;

import opgave06.models.Pizzaria;
import opgave06.models.factories.SimplePizzaFactory;

public class Opgave06 {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizzaria pizzeria = new Pizzaria(pizzaFactory);
        pizzeria.orderPizza("cheese", "NY");
    }
}
