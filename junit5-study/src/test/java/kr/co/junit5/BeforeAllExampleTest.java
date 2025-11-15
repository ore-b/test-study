package kr.co.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllExampleTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("테스트 클래스 시작 전에 딱 한 번");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("테스트 클래스 끝난 뒤에 한 번");
    }

    @Test
    void first_test() {
        System.out.println("first_test 실행");
    }

    @Test
    void second_test() {
        System.out.println("second_test 실행");
    }
}
