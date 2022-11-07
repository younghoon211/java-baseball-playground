import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TextCalculatorTest {

    TextCalculator textCalculator;

    @BeforeEach
    void setUp() {
        textCalculator = new TextCalculator();
    }

    @Test
    @DisplayName("문자열 계산")
    void calculateString() {
        String[] str = {"1", "+", "2", "*", "3"};
        assertThat(textCalculator.calculateString(str)).isEqualTo(9);
    }

    @Test
    @DisplayName("문자열 사칙연산")
    void calculate() {
        assertThat(textCalculator.calculate(1, '+', 2)).isEqualTo(3);
        assertThat(textCalculator.calculate(1, '-', 2)).isEqualTo(-1);
        assertThat(textCalculator.calculate(1, '*', 2)).isEqualTo(2);
        assertThat(textCalculator.calculate(4, '/', 2)).isEqualTo(2);
    }

    @Test
    @DisplayName("더하기")
    void plus() {
        assertThat(textCalculator.plus(1, 2)).isEqualTo(3);
    }

    @Test
    @DisplayName("빼기")
    void minus() {
        assertThat(textCalculator.minus(3, 2)).isEqualTo(1);
    }

    @Test
    @DisplayName("곱하기")
    void multiply() {
        assertThat(textCalculator.multiply(4, 2)).isEqualTo(8);
    }

    @Test
    @DisplayName("나누기")
    void divide() {
        assertThat(textCalculator.divide(8, 4)).isEqualTo(2);
    }

    @Test
    @DisplayName("인트형으로 변환")
    void toInt() {
        assertThat(textCalculator.toInt("5")).isEqualTo(5);
    }

    @Test
    @DisplayName("split이용해 문자열로 만들기")
    void splitString() {
        String str = "나 는 석 영 훈 이 다";
        String[] arr = str.split(" ");

        assertThat(textCalculator.splitString("나 는 석 영 훈 이 다")).isEqualTo(arr);
    }
}
