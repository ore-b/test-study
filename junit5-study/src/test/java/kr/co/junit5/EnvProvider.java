package kr.co.junit5;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

public class EnvProvider implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return true; // 이 템플릿을 지원한다
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(
        ExtensionContext context) {
        return Stream.of(
            contextFor("dev"),
            contextFor("prod")
        );
    }

    private TestTemplateInvocationContext contextFor(String env) {
        return new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return "env=" + env;
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                // 이 실행에서만 String 파라미터를 주입하는 심플 리졸버
                return List.of(new ParameterResolver() {
                    @Override
                    public boolean supportsParameter(ParameterContext pc, ExtensionContext ec) {
                        return pc.getParameter().getType().equals(String.class);
                    }

                    @Override
                    public Object resolveParameter(ParameterContext pc, ExtensionContext ec) {
                        return env;
                    }
                });
            }
        };
    }
}