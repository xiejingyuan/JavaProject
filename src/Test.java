import java.util.*;

public class Test {
    public static void main (String[] args) {
        // select random word from dictionary
        Dictionary dic = new Dictionary();
        String word  = dic.selectWord();
        String hint = dic.hint();
        System.out.println(word);

        // initiate word array
        Display dis = new Display();
        dis.initiate(word);
        dis.show(0);

        // get user input
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        while(isFlag) {
            System.out.printf("Please input a letter (%s): ", hint );
            char input = scan.next().charAt(0);
            char[] wordArray = dis.setLetter(word, input);
            int[] result = Judge.status(wordArray, input);
            dis.show(result[1]);
            if (result[2] == 1) {
                System.out.println("You Win!");
            } else if (result[2] == 0) {
                System.out.println("You Lose!");
            }
            if (result[0] == 0) {
                isFlag = false;
            }
        }
        scan.close();
    }
}
