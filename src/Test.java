import java.util.*;

public class Test {
    public static void main (String[] args) {
        // select random word from dictionary
        Dictionary dic = new Dictionary();
        String word  = dic.selectWord();
        String hint = dic.hint();

        // initiate word array
        Display dis = new Display();
        dis.initiate(word);//display '-' as word length
        dis.showWrongGuess(0);

        // get user input
        Scanner scan = new Scanner(System.in);
        boolean isPlaying = true;
        while(isPlaying) {
            System.out.printf("Please input a letter (%s): ",hint );
            char input = scan.next().charAt(0);
            char[] wordArray = dis.setCorrectLetter(word, input);
            int[] result = Judge.status(wordArray, input);
            dis.showWrongGuess(result[1]);
            if (result[2] == 1) {
                System.out.println("You Win!");
            } else if (result[2] == 0) {
                System.out.println("You Lose!");
            }
            if (result[0] == 0) {
                isPlaying = false;
            }
        }
        System.out.println("Answer: " + word);
        scan.close();
    }
}
