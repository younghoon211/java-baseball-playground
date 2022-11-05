package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        String[] actual2 = "1".split(",");
        assertThat(actual).contains("1", "2");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("예외 발생시키기, charAt메소드 활용하기")
    void charAt2() {
        String actual = "abc";

        assertThatThrownBy(() -> actual.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }
}
