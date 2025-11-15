package kr.co.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("숫자 값 검사")
class NestedDisplayNameExampleTest {

    @Nested
    @DisplayName("값이 양수일 때")
    class When_value_is_positive {

        @Test
        @DisplayName("0보다 커야 한다")
        void should_be_greater_than_zero() {
        }
    }

    @Nested
    @DisplayName("값이 0일 때")
    class When_value_is_zero {

        @Test
        @DisplayName("0과 같아야 한다")
        void should_be_equal_to_zero() {
        }
    }
}
