import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBookDesign {
    public static void main(String[] args) {

        String name;
        int portionNumber;
        String cuisine;
        double cookTime;
        int difficulty;
        String response = "";
        Random rand;

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> portionList = new ArrayList<Integer>();
        ArrayList<String> cuisineList = new ArrayList<String>();
        ArrayList<Double> cookTimeList = new ArrayList<Double>();
        ArrayList<Integer> difficultyList = new ArrayList<Integer>();

        while (!response.equals("quit")) {
            System.out.println("Enter name of recipe ");
            nameList.add(keyboard.next());
            System.out.println("Recipe: " + nameList);

            System.out.println("Enter portion/serving size ");
            portionList.add(keyboard.nextInt());
            System.out.println("Serving size: " + portionList);

            System.out.println("Enter type of cuisine ");
            cuisineList.add(keyboard.next());
            System.out.println("cuisine: " + cuisineList);

            System.out.println("Enter cooking time (in minutes)");
            cookTimeList.add(keyboard.nextDouble());
            System.out.println("Cooking Time: " + cookTimeList);

            System.out.println("Enter difficulty of recipe (1=easy, 2=medium, 3=hard) ");
            difficultyList.add(keyboard.nextInt());
            System.out.println("Level of difficulty: " + difficultyList);

            System.out.print("Do you have another item? Press yes or quit to exit.");
            response = keyboard.next();

        }

        System.out.println("Name list: " + nameList);

        System.out.println("Portion list: " + portionList);

        for (int i=0; i<nameList.size(); i++) {
            System.out.println(nameList.get(i) + "\t" + portionList.get(i) + "\t" + cuisineList.get(i) + "\t" + cookTimeList.get(i) + "\t" + difficultyList.get(i));

            /*System.out.println(portionList.get(i));
            System.out.println(cuisineList.get(i));
            System.out.println(cookTimeList.get(i));
            System.out.println(difficultyList.get(i));*/

        }


    }
}
