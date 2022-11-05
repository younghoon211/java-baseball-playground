import java.util.Scanner;

public class TextCalculator {
    public int calculateString(String[] str) {
        int result = toInt(str[0]);

        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, str[i + 1].charAt(0), toInt(str[i + 2]));
        }

        return result;
    }

    public int calculate(int a, char operator, int b) {
        if (operator == '+') {
            return plus(a, b);
        }

        if (operator == '-') {
            return minus(a, b);
        }

        if (operator == '*') {
            return multiply(a, b);
        }

        if (operator == '/') {
            return divide(a, b);
        }

        return 0;
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        }

        return a / b;
    }
}
