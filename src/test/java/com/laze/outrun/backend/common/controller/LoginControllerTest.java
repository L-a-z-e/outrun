package com.laze.outrun.backend.common.controller;

import com.laze.outrun.backend.common.domain.sample.dto.SampleResponseDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 자동으로 import가 안됨
import javax.naming.Name;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest( controllers = LoginController.class)
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;
    String url  = "login";
    @Test
    public void login() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk())
                .andExpect(content().string(url));

    }
    @Test
    public void sampleDtoReturn() throws Exception {
        String name = "login";
        int amount = 1000;

        // param - API테스트에 사용될 요청 파라미터 설정, String 값만 허용 (숫자, 날짜도 String으로 변경해야함)
        // jsonPath - JSON 응답값을 필드별로 검증할 수 있는 메서드, $를 기준으로 필드명 명시
        mockMvc.perform(
                get("/login/dto")
                .param("name", name)
                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));

    }
}
