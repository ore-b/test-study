package kr.co.junit5;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTests {

    @BeforeEach
    void setUp() { /* 각 DynamicTest 실행 전마다 호출됨 */ }

    @TestFactory
    Stream<DynamicTest> generatesTestsFromData() {
        int[] nums = {1, 2, 3, 4};
        return java.util.Arrays.stream(nums)
            .mapToObj(n ->
                DynamicTest.dynamicTest(
                    "n=" + n + " 는 짝수인가?",
                    () -> Assertions.assertEquals(0, n % 2, "짝수가 아님")
                )
            );
    }
}
