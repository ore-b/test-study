package kr.co.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvProvider.class)
class EnvTemplateTest {

    @TestTemplate
    void worksWithDifferentEnvs(String env) {
        // 위 Provider가 env 파라미터에 "dev" 또는 "prod"를 주입
        assertTrue(env.equals("dev") || env.equals("prod"));
        // 실제로는 여기서 env별 클라이언트/설정으로 검증 수행
        System.out.println("running on " + env);
    }
}