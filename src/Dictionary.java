import java.util.*;
public class Dictionary {

    private int category;
    private final String[][] dic = {
        {"TORONTO","MONTREAL","CALGARY","VANCOUVER","OTTAWA","EDMONTON","QUEBEC","WINNIPEG","HALIFAX","VICTORIA"},
        {"APPLE", "BANANA", "ORANGE", "GRAPE", "BLUEBERRY", "WATERMELON", "PINEAPPLE", "STRAWBERRY", "MANGO", "KIWI"},
        {"SOCCER","TENNIS","GOLF","SWIMMING","HOCKEY","BASEBALL","BADMINTON","CURLING","SKIING","RUGBY"}
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
                return "city in Canada";
            case 1:
                return "fruit";
            case 2:
                return "sports";
            default:
                return null;
        }
    }
}
