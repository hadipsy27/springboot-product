package com.springboot.finalexamp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.finalexamp.controller.ProductController;
import com.springboot.finalexamp.entity.Product;
import com.springboot.finalexamp.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    ProductService  productService;

    Product product1 = new Product(1L, "sampo goreng", 123L);
	Product product2 = new Product(2L, "sampo Bakar", 124L);
	Product product3 = new Product(3L, "sampo rebus", 125L);

	@Test
	public void getAllRecords_success() throws Exception{
		List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3));

		Mockito.when(productService.getAllProduct()).thenReturn(productList);

		mockMvc.perform(MockMvcRequestBuilders
				.get("/products")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[1].name", is("sampo Bakar")));
	}
}
