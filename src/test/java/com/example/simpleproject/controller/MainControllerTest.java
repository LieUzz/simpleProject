package com.example.simpleproject.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
@ExtendWith(MockitoExtension.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testGetEmployee_success() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/test")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        String target = "Hello";
        assertEquals(target, result.getResponse().getContentAsString());
    }
}
