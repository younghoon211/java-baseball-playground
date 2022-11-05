import java.util.Scanner;

public class TextCalculator {
    public int calculateString(String[] str) {
        int result = toInt(str[0]);

        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, str[i + 1].charAt(0), toInt(str[i + 2]));
        }

        return result;
    }
}
