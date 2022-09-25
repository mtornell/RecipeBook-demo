import java.util.Scanner;

public class Main {
    static int exit = 0;
    static int op = -1;
    public static void main(String[] args) {
        recipeBook r = new recipeBook();
        r.addRecipes();
        Scanner scnr = new Scanner(System.in);
        
        while (exit == 0) {
            System.out.println("What would you like to do?\n1 - Read recipe\n2 - Exit");
            op = scnr.nextInt();
            scnr.nextLine();
            if (op == 1) {
                r.readRecipe();
            }
            else if (op == 2)
                exit = 1;
            else
                System.out.println("Error");
        }
        scnr.close();
    }
}