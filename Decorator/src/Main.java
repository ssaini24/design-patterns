import BasePizzaDecorator.BasePizza;
import BasePizzaDecorator.Margherita;
import ToppingDecorator.ExtraCheese;
import ToppingDecorator.Topping;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to decorator pattern!!");

        BasePizza basePizza = new Margherita();
        Topping pizza1 = new ExtraCheese(basePizza);

        System.out.println("cost of margherita + extra cheese: " + pizza1.cost());

        Topping pizza2 = new ExtraCheese(new ExtraCheese(basePizza));

        System.out.println("cost of margherita + extra cheese + extra cheese: " + pizza2.cost());
    }
}