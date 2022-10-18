package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
//import com.example.demo.repository.SqlRepository;

@Service
public class ProductService {
	
	Logger log = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository productRepository;
	
//	@Autowired
//	private SqlRepository sqlRepository;
	
//	public ProductService(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}
	
	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.category(productRequest.getCategory())
				.modelNumber(productRequest.getModelNumber())
				.color(productRequest.getColor())
				.lunchedYear(productRequest.getLunchedYear())
				.postedDateAndTime(new Date())
				.tags(productRequest.getTags())
				.build();
		
		productRepository.save(product);
		
		Product product1 = Product.builder()
				.id(productRequest.getModelNumber())
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.category(productRequest.getCategory())
				.modelNumber(productRequest.getModelNumber())
				.color(productRequest.getColor())
				.lunchedYear(productRequest.getLunchedYear())
				.postedDateAndTime(new Date())
				.tags(productRequest.getTags())
				.build();
		
//		sqlRepository.save(product1);
		
		log.info("Product {} is saved", product.getId());
	}

	public List<ProductResponse> getAllProducts() {
	
		List<Product> products =  productRepository.findAll();
//		return products.stream().map(this::mapToProductResponse).toList();
		return null;
		
	}
	
	private ProductResponse mapToProductResponse(Product product) {
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.category(product.getCategory())
				.modelNumber(product.getModelNumber())
				.color(product.getModelNumber())
				.soldCount(product.getSoldCount())
				.rating(product.getRating())
				.lunchedYear(product.getLunchedYear())
				.postedDateAndTime(product.getPostedDateAndTime())
				.tags(product.getTags())
				.build();
	}

	public List<ProductResponse> getSearchResult(String searchString) {
		List<Product> products = productRepository.serach(searchString);
		System.out.println(products);
		return products.stream().map(this::mapToProductResponse).toList();
	}
	
	
	

}