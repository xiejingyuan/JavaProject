public class Display {

    private char[] wordArray;

    public void initiate(String word) {
        wordArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = '-';
        }
    }

    public char[] setCorrectLetter(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                wordArray[i] = letter;
            }
        }
        return wordArray;
    }

    public void showWrongGuess(int wrongCount) {
        for (char c : wordArray) {
            System.out.print(c);
        }
        System.out.println("\tWrong Guess: " + wrongCount);
    }
}

