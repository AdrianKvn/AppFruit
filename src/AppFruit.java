import dto.Fruit;

import java.util.ArrayList;

public class AppFruit {
        public static void main(String[] args) {
        System.out.println("Mango valor por 1 kg = 1,23 USD");

        Fruit fruit = new Fruit();
        ArrayList<String> colors = new ArrayList<>();
        colors.add("verde");
        colors.add("amarillo");

        fruit.setName("Mango");
        fruit.setAverageWeight(1.342f);
        fruit.setColors(colors);
        fruit.setPrice(1.23f);

        fruit.sell();
    }

}
