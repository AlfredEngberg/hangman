import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class neoarbete {

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner file = new Scanner(new File("message.txt"));
        Scanner sc = new Scanner(System.in);

        //Gör en array
        String[] words = {"bolt rifle with vengeance class scope"};  //                   !!!!  länka message.txt  !!!!

        //Slumpmässigt ord
        int randomIndex = (int) (Math.random() * words.length);
        String selectedWord = words[randomIndex];

        //Gissningar
        char[] playerGuesses = new char[selectedWord.length()];

        for (int i = 0; i < playerGuesses.length; i++) {
            playerGuesses[i] = '_';
        }

        int incorrectGuesses = 0;
        boolean correctGuess = false;
        boolean wordCompleted = false;

        //Starta hänga gubbe
        while (!wordCompleted && incorrectGuesses < 6) {
            System.out.println("Antal gissningar: " + new String(playerGuesses));
            System.out.println("Antal fel: " + incorrectGuesses);
            System.out.println("Gissa en bokstav:");
            char playerGuess = sc.nextLine().charAt(0);

            //Kolla om gissningen är i ordet
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == playerGuess) {
                    playerGuesses[i] = playerGuess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                incorrectGuesses++;
            }

            //Kolla om ordet är färdigt
            if (new String(playerGuesses).equals(selectedWord)) {
                wordCompleted = true;
                System.out.println("Grattis! ordet var " + selectedWord + "!");
            }

            correctGuess = false;
        }

        if (incorrectGuesses == 6) {
            System.out.println("Gubben blev hängd, ordet var " + selectedWord + ".");
        }

        sc.close();
    }
}
