public class Judge {
    private static int num = 0;
    public static int[] status (char[] wordArray, char letter) {
        int[] result = {0, 0, 2}; // flag, wrong times, win status
        boolean complete = true;
        boolean wrong = true;
        for (char c: wordArray) {
            if (c == letter){
                wrong = false;
            }else if (c == '-') {
                complete = false;
            }
            if (!complete && !wrong) {
                break;
            }
        }
        if (wrong) {
            num++;
        }
        result[1] = num;
        if (complete) {
            result[2] = 1; // win
        } else if(num == 5){
            result[2] = 0; // lose
        } else {
            result[0] = 1; // continue
        }
        return result;
    }
}

