package kr.co.oreb.test.spring;


import static org.assertj.core.api.Assertions.assertThat;

import kr.co.oreb.MyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

//스프링 부트 전체 컨텍스트 안 띄우고 (@WebMvcTest) 지정한 컨트롤러(UserVehicleController) + MVC 인프라만 로딩
@WebMvcTest(MyApplication.class)
class SliceTest {

    @Autowired
    private MockMvcTester mvc;

//    @MockitoBean
//    private UserVehicleService userVehicleService;

    @Test
    void testExample() {
//        given(this.userVehicleService.getVehicleDetails("sboot"))
//            .willReturn(new VehicleDetails("Honda", "Civic"));
        assertThat(this.mvc.get().uri("/").accept(MediaType.TEXT_PLAIN))
            .hasStatusOk()
            .hasBodyTextEqualTo("Hello World!");
    }

}