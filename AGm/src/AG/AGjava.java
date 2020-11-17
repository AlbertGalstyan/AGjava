//Program decides EVEN and ODD numbers, makes reverse lowercase and conc.. with word inputed by user
package AG;

import java.util.Scanner;

public class AGjava {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter number");
        String input = user.next();
        try {
            int number = Integer.parseInt(input);


            if (number % 2 == 0) {
                System.out.println("You entered odd number");
            } else {
                System.out.println("You entered even number");
            }

            System.out.println("Enter a word to view REVERSED, LOWERCASED and CONCATED");
            String sentence = user.next();
            System.out.println("You entered " + sentence);
            StringBuilder str = new StringBuilder(sentence);
            System.out.println("reversed " + str.reverse());
            System.out.println("lovercased " + sentence.toLowerCase());
            System.out.println("concated with number enterd above " + sentence + input);
        }
        catch (NumberFormatException e) {
            System.out.println("Please ENTER NUMBER");
        }
    }

}
