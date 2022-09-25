import java.util.Scanner;

public class recipe {
    String recipeName;
    Scanner scnr = new Scanner(System.in);
    String[] ingredients;
    int numIngredients;
    String desc;
    
    public recipe() {
        System.out.println("Enter Recipe Name: ");
        recipeName = scnr.nextLine();
        addIngredients();
        addDescription();
    }

    public void addIngredients() {
        System.out.println("How many ingredients are there?");
        numIngredients = scnr.nextInt();
        scnr.nextLine();
        ingredients = new String[numIngredients];
        for (int i = 0; i < numIngredients; i++) {
            System.out.println("Enter Ingredient Name: ");
            ingredients[i] = scnr.nextLine();
        }
    }

    public void addDescription() {
        System.out.println("Enter Description: ");
        desc = scnr.nextLine();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void printRecipe() {
        System.out.println("What you'll need:");
        for (String i : ingredients) {
            System.out.println("~  " + i);
        }
        System.out.println("Description:\n   " + desc);

    }

}

    