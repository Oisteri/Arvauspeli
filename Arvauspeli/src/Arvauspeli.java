import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) throws Exception {
      
        Scanner in = new Scanner(System.in);    

        String input = "";
        String correctname = "Aatu";
        String stop = "Stop";

            do {
                System.out.println("Guess my name (type Stop to end the game)");
                input = in.nextLine();

                if (input.equalsIgnoreCase(stop))
                    {
                        System.out.println("Thank you for playing!");
                        break;
                    }

                if (input.equalsIgnoreCase(correctname)) 
                    {
                        System.out.println("Congratulations! You guessed correctly!");
                        break;
                    }
                else 
                    {
                        System.out.println("Wrong! You guessed incorrectly, guess again!");
                    }

            } while (!input.equals(correctname));
    }
}
