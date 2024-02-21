package ToppingDecorator;

import BasePizzaDecorator.BasePizza;

public class ExtraCheese extends Topping {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
