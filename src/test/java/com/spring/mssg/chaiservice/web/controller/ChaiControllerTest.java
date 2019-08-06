package com.spring.mssg.chaiservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(ChaiController.class)
class ChaiControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void getChaiById() throws Exception{

      //  mockMvc.perform(get(0))
    }

    @Test
    void saveChai() {
    }

    @Test
    void updateChaiById() {
    }
}