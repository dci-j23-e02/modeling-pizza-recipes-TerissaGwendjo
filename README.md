### Exercise: Modeling Pizza Recipes with Java Records

#### Background
In this exercise, you will practice using Java records to model immutable data. You will create a simple model for pizza recipes, which will include the name of the pizza, a list of ingredients, and the cooking instructions. This exercise will help you understand how to use records to represent data concisely and clearly.

#### Objectives
- Create a traditional class to model a pizza recipe.
- Refactor the traditional class into a Java record.
- Understand the benefits of using records for immutable data representation.

#### Instructions

1. **Create a Traditional Pizza Recipe Class**
   - Start by creating a traditional class named `TraditionalPizzaRecipe`.
   - The class should have three private final fields:
     - `String name` for the pizza name.
     - `List<String> ingredients` for the list of ingredients.
     - `String instructions` for the cooking instructions.
   - Implement a constructor that initializes these fields.
   - Provide getter methods for each field.
   - Override the `equals`, `hashCode`, and `toString` methods appropriately to ensure object comparison and string representation are handled correctly.

2. **Test Your Traditional Class**
   - Create a simple `main` method or a separate test class.
   - Instantiate a `TraditionalPizzaRecipe` object with a name, a list of ingredients, and cooking instructions.
   - Print the object to the console to verify that your `toString` method works as expected.

3. **Refactor into a Java Record**
   - Now, refactor your `TraditionalPizzaRecipe` class into a Java record named `PizzaRecipe`.
   - Define the record with the same fields: `name`, `ingredients`, and `instructions`.
   - Notice how much shorter and cleaner your code becomes.

4. **Test Your Java Record**
   - In your `main` method or test class, create an instance of `PizzaRecipe` with the same details as before.
   - Print the record instance to the console.
   - Compare the output and the amount of code required with the traditional class implementation.

#### Deliverables
- The `TraditionalPizzaRecipe` class with all required methods and fields.
- The `PizzaRecipe` record.
- A simple test implementation that demonstrates creating instances of both the traditional class and the record, and printing them.

#### Bonus Challenge
- Add a method to the `PizzaRecipe` record that calculates the estimated cooking time based on the number of ingredients (e.g., assume each ingredient adds 2 minutes to the cooking time). Since records are immutable, consider how you can implement this functionality efficiently.

This exercise will help you grasp the simplicity and power of Java records for modeling immutable data structures.
