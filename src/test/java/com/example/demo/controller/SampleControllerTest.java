package com.example.demo.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.example.demo.DemoApplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SampleControllerTest {

    @Autowired
    private SampleController sampleController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(sampleController).build();
    }

    @Test
    public void sampleTestResponse() {
        try {
            // コントローラーリクエスト
            MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/sample"))
                    .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
            assertEquals(result.getResponse().getContentAsString(), "sample");
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("テスト失敗");
        }
    }

}
