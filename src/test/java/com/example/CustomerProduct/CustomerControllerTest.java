package com.example.CustomerProduct;

import com.example.CustomerProduct.controller.CustomerController;
import com.example.CustomerProduct.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class) // Use WebMvcTest for Controller tests
class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock // Use @Mock instead of @MockBean
    private CustomerService customerService;

    @Test
    void testGetCustomers() throws Exception {
        Mockito.when(customerService.getAllCustomers()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/api/customers"))
                .andExpect(status().isOk());
    }
}
