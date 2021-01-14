package com.example.springboot_jpa.web;


import com.example.springboot_jpa.web.api.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = TestController.class)
public class TestControllerTest {

    @Autowired
    private MockMvc Mock;

    @Test
    public void 테스트컨트롤러() throws Exception{
        String inputText="hello";

        Mock.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(inputText));
    }
}
