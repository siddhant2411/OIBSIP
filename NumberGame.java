import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        char tryAgainChoice='y';
        int level=1;
        int score=0;
        while (tryAgainChoice=='y' || tryAgainChoice=='Y') {
            int realNumber=rand.nextInt(100);
            int flag=0;
            int numberOfAttempts=8;
            System.out.println("\n\n\nwelcome to level "+level);
            while (numberOfAttempts-level > 0)
            {
                System.out.println("Guess the Number: ");
                int guessedNumber = sc.nextInt();
                if (guessedNumber == realNumber) {
                    flag = 1;
                    break;
                } else {
                    if (guessedNumber > realNumber) {
                        System.out.println("Try Guessing lower number");
                        numberOfAttempts--;
                    } else {
                        System.out.println("Try guessing higher number");
                        numberOfAttempts--;
                    }
                }
            }
            if (flag == 1)
            {
                System.out.println("You guessed the answer correctly which is " + realNumber);
                score=score+numberOfAttempts*20;
                System.out.println("Your score is "+score);
                if(level<4)
                {
                    level++;
                }
                else if(level==4)
                {
                    System.out.println("You passed the game");
                    System.out.println("Want to try again?(Y/N)");
                    level=1;
                    tryAgainChoice=sc.next().charAt(0);
                }
            }
            else {
                System.out.println("Sorry You failed. The number was "+realNumber);
                System.out.println("Want to try again?(Y/N)");
                level=1;
                tryAgainChoice=sc.next().charAt(0);
            }
        }

    }
}
