import java.util.Scanner;

public class App{
    public static void main(String[] args) {

                   /*
 * ************************************************
 * ****  My first Task in CodeSoft Java-Programming Intership  ****
 * **************************************************
 */

        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        System.out.println("Welcome to the Game of Guessing !");
       
            System.out.println("You have totally 8 chances");
           
            System.out.println("Lets Start!");
            System.out.println("  ");

        while (playAgain) {
            int rand = getRandN(1, 100);
            int chances = 8;
            while (chances > 0) {
                System.out.println("Guess a number between 1 and 75: ");
                int guess = sc.nextInt();

                if (guess == rand) {
                    System.out.println(" Congratulations! You won!");
                    break;
                } else if (guess < rand) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }

                chances--;
                if (chances > 0) {
                    System.out.println("You have " + chances + " chances left.");
                }
            }

            if (chances == 0) {
                System.out.println("You lost! The random number was " + rand);
                System.out.println("GAME OVER");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String ans = sc.next();
            playAgain = ans.equalsIgnoreCase("yes");
        } 
         sc.close();
    }

    public static int getRandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

