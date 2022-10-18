package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.InventoryResponse;
import com.example.demo.repository.InventoryRepository;

import lombok.SneakyThrows;

@Service
public class InventoryService {
	
	Logger log = LoggerFactory.getLogger(InventoryService.class);

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Transactional(readOnly = true)
	@SneakyThrows
	public List<InventoryResponse> isInStock(List<String> skuCode) throws Exception {
//		System.out.println("find all" + inventoryRepository.findAll());
//		System.out.println("fing by sku code" + inventoryRepository.findBySkuCode(skuCode));
		
		log.info("Wait Started");
//		Thread.sleep(10000);
		log.info("Wait Ended");
		
		
		return inventoryRepository.findBySkuCodeIn(skuCode).stream()
				.map(inventory -> 
					InventoryResponse.builder().skuCode(inventory.getSkuCode())
					.isInStock(inventory.getQuantity() > 0)
					.build()
				).toList();
	}
}
