public class Judge {
    private static int wrongCount = 0;

    public static int[] status(char[] wordArray, char letter) {
        int[] result = {0, 0, 2}; // flag, wrong times, win status
        boolean complete = true;
        boolean wrong = true;
        for (char c : wordArray) {
            if (c == letter) {
                wrong = false;
            } else if (c == '-') {
                complete = false;
            }
            if (!complete && !wrong) {
                break;
            }
        }
        if (wrong) {
            wrongCount++;
            printHangMan(wrongCount);

        }
        result[1] = wrongCount;
        if (complete) {
            result[2] = 1; // win
        } else if (wrongCount == 6) {
            result[2] = 0; // lose
        } else {
            result[0] = 1; // continue
        }
        return result;
    }

    private static void printHangMan(int wrongCount) {
        System.out.println(" -------");
        System.out.println(" |     |");
        switch (wrongCount) {
            case 1:
                System.out.println(" O     |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");
                break;
            case 2:
                System.out.println(" O     |");
                System.out.println("  \\    |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");

                break;
            case 3:
                System.out.println(" O     |");
                System.out.println("/ \\    |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");
                break;
            case 4:
                System.out.println(" O     |");
                System.out.println("/|\\    |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");
            case 5:
                System.out.println(" O     |");
                System.out.println("/|\\    |");
                System.out.println("/      |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");
                break;
            case 6:
                System.out.println(" O     |");
                System.out.println("/|\\    |");
                System.out.println("/ \\    |");
                System.out.println("       |");
                System.out.println(" ~~~~~~~~~");
                break;
            default:
                break;
        }
    }
}

