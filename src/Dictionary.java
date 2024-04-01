import java.util.*;
public class Dictionary {

    private int category;
    private final String[][] dic = {
            {"dog", "cat", "rabbit", "parrot", "snake", "fish"},
            {"apple", "banana", "orange", "grape", "blueberry", "watermelon"},
            {"football", "swimming", "basketball", "running", "hiking", "tennis"}
    };

    public String selectWord () {
        int i = new Random().nextInt(3);
        int j = new Random().nextInt(6);
        category = i;
        return dic[i][j];
    };

    public String hint () {
        switch (category) {
            case 0:
                return "animals";
            case 1:
                return "fruit";
            case 2:
                return "sports";
            default:
                return null;
        }
    }
}
