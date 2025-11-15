package kr.co.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LoggingExtension.class)
class ExtendWithLoggingExampleTest {

    @Test
    void first_test() {
        System.out.println("first_test 실행");
    }

    @Test
    void second_test() {
        System.out.println("second_test 실행");
    }
}
