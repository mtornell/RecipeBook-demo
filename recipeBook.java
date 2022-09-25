import java.util.Scanner;

public class recipeBook {
    String bookName;
    Scanner scnr = new Scanner(System.in);
    recipe[] book;
    int recipeNum;
    
    public recipeBook() {
        System.out.println("Enter Recipe Book Name: ");
        bookName = scnr.nextLine();
        System.out.println("How many recipes would you like:");
        recipeNum = scnr.nextInt();
        book = new recipe[recipeNum];
    }

    public void addRecipes() {
        for (int i = 0; i < recipeNum; i++) {
            recipe rec = new recipe();
            book[i] = rec;
        }
    }

    public void readRecipe() {
        System.out.println("What is the name of the recipe you would like to read?");
        scnr.nextLine();
        String input = scnr.nextLine();
        for (recipe r : book) {
            if (r.getRecipeName().equals(input)) // assume always foudn for these purposes
                r.printRecipe();
        }
    }
}