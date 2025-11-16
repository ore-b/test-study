package kr.co.oreb.test.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

@SpringBootTest
@AutoConfigureMockMvc//MockMvc 관련 빈(MockMvc, MockMvcTester 등)을 자동으로 구성해 주는 애노테이션.
public class AutoConfigureMockMvcTest {

    @Test
    void testWithMockMvc(@Autowired MockMvc mvc) throws Exception {
        //실제 서버에 HTTP 요청 보내는 게 아니라 “컨트롤러로 가는 요청을 코드로 시뮬레이션” 하는 것.
        mvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World!"));
    }

    @Test
    void testWithMockMvcTester(@Autowired MockMvcTester mvc) {
        assertThat(mvc.get().uri("/"))
            .hasStatusOk()
            .hasBodyTextEqualTo("Hello World!");
    }

    @Test
    void testWithWebTestClient(@Autowired WebTestClient webClient) {
        webClient
            .get().uri("/")
            .exchange()
            .expectStatus().isOk()
            .expectBody(String.class).isEqualTo("Hello World!");
    }

}
