package com.example.CustomerProduct;

import com.example.CustomerProduct.controller.CustomerController;
import com.example.CustomerProduct.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


@WebMvcTest(CustomerController.class) // Use WebMvcTest for Controller tests
class CustomerControllerTest {


    @Test
    void testGetCustomers() {
    }
}
