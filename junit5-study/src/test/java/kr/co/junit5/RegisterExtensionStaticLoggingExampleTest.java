package kr.co.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class RegisterExtensionStaticLoggingExampleTest {

    @RegisterExtension
    static LoggingExtension loggingExtension = new LoggingExtension();

    @Test
    void first_test() {
        System.out.println("first_test 본문");
    }

    @Test
    void second_test() {
        System.out.println("second_test 본문");
    }
}
