package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

//	Optional<Inventory> findBySkuCode();

//	Optional<Inventory> findBySkuCode(String skuCode);

	List<Inventory> findBySkuCodeIn(List<String> skuCode);

}
