import java.util.List;
import java.util.Objects;

    public record PizzaRecipe(String name, List<String> ingredients, String instructions) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PizzaRecipe that = (PizzaRecipe) o;
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
            return "PizzaRecipe{" +
                    "name='" + name + '\'' +
                    ", ingredients=" + ingredients +
                    ", instructions='" + instructions + '\'' +
                    '}';
        }
    }


