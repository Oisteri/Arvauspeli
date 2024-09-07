import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) throws Exception {
      
        Scanner in = new Scanner(System.in);    

        String input = "";
        String correctname = "Aatu";


            do {
                System.out.println("Guess my name");
                input = in.nextLine();

                if (input.equalsIgnoreCase(correctname)) 
                    {
                        System.out.println("Congratulations! You guessed correctly!");
                    }
                else 
                    {
                        System.out.println("Wrong! You guessed incorrectly, guess again!");
                    }

            } while (!input.equals(correctname));
        
    }
}
