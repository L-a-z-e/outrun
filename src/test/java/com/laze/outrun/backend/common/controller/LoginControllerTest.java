package com.laze.outrun.backend.common.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

// 자동으로 import가 안됨
import javax.naming.Name;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest( controllers = LoginController.class)
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;
    String login  = "login";
    @Test()
    public void login() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk());

    }
}
