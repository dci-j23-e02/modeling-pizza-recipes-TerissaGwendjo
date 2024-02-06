import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Testing the traditional Pizza recipe
            TraditionalPizzaRecipe pizzaRecipe1 = new TraditionalPizzaRecipe(
                    "Margherita",
                    Arrays.asList("Dough", "Tomato sauce", "Mozzarella", "Basil" , "\n"),
                    "Preheat oven to 475°F. Spread the tomato sauce over the dough, add cheese and basil. Bake for 10-12 minutes."
            );


            System.out.println();
            System.out.println(pizzaRecipe1);
            System.out.println();


        PizzaRecipe pizzaRecipe2 = new PizzaRecipe(
                "Margherita",
                Arrays.asList("Dough", "Tomato sauce", "Mozzarella", "Basil" , "\n"),
                "Preheat oven to 475°F. Spread the tomato sauce over the dough, add cheese and basil. Bake for 10-12 minutes."
        );

        System.out.println(pizzaRecipe2);
    }


}
