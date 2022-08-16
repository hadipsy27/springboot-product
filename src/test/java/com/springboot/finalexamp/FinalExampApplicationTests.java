package com.springboot.finalexamp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.finalexamp.controller.ProductController;
import com.springboot.finalexamp.entity.Product;
import com.springboot.finalexamp.repository.ProductRepository;
import com.springboot.finalexamp.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
//@WebMvcTest(ProductController.class)
class FinalExampApplicationTests {
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@Autowired
//	ObjectMapper objectMapper;
//
//	@Autowired
//	ProductService productService;
//
//	@MockBean
//	ProductRepository productRepository;
//
//	Product product1 = new Product(342L, "sampo goreng", 123L);
//	Product product2 = new Product(343L, "sampo Bakar", 124L);
//	Product product3 = new Product(45L, "sampo rebus", 125L);
//
//	@Test
//	public void getAllRecords_success() throws Exception{
//		List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3));
//
//		Mockito.when(productRepository.findAll()).thenReturn(productList);
//
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/products")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$", hasSize(3)))
//				.andExpect(jsonPath("$[2].name", is("sampo goreng")));
//	}

//	@Test
//	public void testCreate(){
//		Product product = new Product();
//		product.setId(1344L);
//	}
}
