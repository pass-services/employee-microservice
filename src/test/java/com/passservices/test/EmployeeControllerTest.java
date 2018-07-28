package com.passservices.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.passservices.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class EmployeeControllerTest {

    private static final String CONTENT_TYPE = "application/json;charset=UTF-8";

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void whenCreateGetEmployee_thenOk() throws Exception {
        String employeeJson = "{\"firstName\":\"John\",\"lastName\":\"Do\",\"birthDate\":\"1978-02-03\",\"securityId\":\"GDUSK675764GDJS\"}";

        this.mockMvc.perform(post("/employees").contentType(CONTENT_TYPE).content(employeeJson)).andExpect(status().isCreated());
        
        String employee2Json = "{\"firstName\":\"Mary\",\"lastName\":\"Shelley\",\"birthDate\":\"1982-05-03\",\"securityId\":\"JSUSJK675764GDJS\",\"identityId\":\"FR57755820920\",\"expirationDate\":\"2014-12-11\"}";

        this.mockMvc.perform(post("/employees").contentType(CONTENT_TYPE).content(employee2Json)).andExpect(status().isCreated());

        this.mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(content().contentType(CONTENT_TYPE)).andExpect(jsonPath("$", hasSize(2))).andExpect(jsonPath("$[0].firstName", is("Ana"))).andExpect(jsonPath("$[1].firstName", is("John"))).andExpect(jsonPath("$[1].firstName", is("Mary")));
    }
}
