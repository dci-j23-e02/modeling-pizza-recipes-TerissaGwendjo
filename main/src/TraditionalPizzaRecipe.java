import java.util.List;
import java.util.Objects;

    public class TraditionalPizzaRecipe {
        private final String name;
        private final List<String> ingredients;
        private final String instructions;

        public TraditionalPizzaRecipe(String name, List<String> ingredients, String instructions) {
            this.name = name;
            this.ingredients = ingredients;
            this.instructions = instructions;
        }

        public String getName() {
            return name;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        public String getInstructions() {
            return instructions;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TraditionalPizzaRecipe that = (TraditionalPizzaRecipe) o;
            return Objects.equals(name, that.name) &&
                    Objects.equals(ingredients, that.ingredients) &&
                    Objects.equals(instructions, that.instructions);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, ingredients, instructions);
        }

        @Override
        public String toString() {
            return "TraditionalPizzaRecipe{" +
                    "name='" + name + '\'' +
                    ", ingredients=" + ingredients +
                    ", instructions='" + instructions + '\'' +
                    '}';
        }
    }

