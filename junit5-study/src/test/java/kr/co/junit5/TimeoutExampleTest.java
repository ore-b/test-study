package kr.co.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeoutExampleTest {

    @Test
    @Timeout(1)
        // 1초 안에 끝나야 함 (기본 단위: 초)
    void should_finish_within_one_second() throws InterruptedException {
        Thread.sleep(500); // 0.5초 → 통과
    }
}
