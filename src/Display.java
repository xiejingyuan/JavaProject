public class Display {

    private char[] wordArray;

    public void initiate(String word) {
        wordArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = '-';
        }
    }

    public char[] setLetter(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                wordArray[i] = letter;
            }
        }
        return wordArray;
    }

    public void show(int num) {
        for (char c : wordArray) {
            System.out.print(c);
        }
        System.out.println("    Wrong Guess: " + num);
    }
}

