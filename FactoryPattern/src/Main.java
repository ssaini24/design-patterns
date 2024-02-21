import SpringFactory.Factory;
import SpringFactory.Shape;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to factory pattern!!");

        Factory factory = new Factory();
        Shape circle = factory.getShape("circle");

        if (Objects.nonNull(circle)){
            System.out.println(circle.getShape());
            return;
        }

        System.out.println("This shape does not exist");
    }
}