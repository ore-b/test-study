package kr.co.junit5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@Slf4j
class AnnotationTests {


    @Test
    void test1() {
        log.info("@Test : 이 메소드가 테스트 메소드 명시");
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c"})
    void test2(String arg) {
        log.info("@ParameterizedTest : 메서드가 매개변수화된 테스트 임을 나타냅니다. arg:{}", arg);
    }

    @RepeatedTest(3)
    void test3() {
        log.info("@RepeatedTest : 메서드가 반복 테스트를 위한 테스트 템플릿임을 나타냅니다 .");
    }

}
