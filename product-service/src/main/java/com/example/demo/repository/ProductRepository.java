package com.example.demo.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

	List<Product> findByName(String searchString);

//	List<Product> search(String searchString);

	

//	List<Product> search(String searchString);
	
//	@Query(value = "SELECT * FROM product u WHERE u.status = ?1", nativeQuery = true)
//	User findUserByStatusNative(Integer status);
	
//	"SELECT * FROM product WHERE name LIKE '%Value1%' OR tags LIKE '%Value1%';
//	https://www.baeldung.com/queries-in-spring-data-mongodb
//	https://stackoverflow.com/questions/3305561/how-to-query-mongodb-with-like
	
//	@Query(value = "SELECT * FROM product WHERE name LIKE '%?1%' OR tags LIKE '%?1%'", nativeQuery = true)
//	List<Product> search(String searchString);
	
//	db.yourCollectionName.find({"yourFieldName" : /.*yourMatchingValue.*/}).pretty();
	
//	Query query = new Query();
//	query.addCriteria(Criteria.where("name").is("Eric"));
//	List<Product> users = MongoTemplate.find(query, Product.class);
	
//	db.employee.find({"EmployeeName":/.*J.*/}).pretty();
	
//	@org.springframework.data.mongodb.repository.Query(value = "db.product.find({/.*"name".*/:/.*akash.*/})")
//	List<Product> serach(String searchString);
	
//	db.mycol.find({ $and: [ {name:/.*i.*/}, {name:/.*i.*/} ] }).pretty()
	
	@org.springframework.data.mongodb.repository.Query(value = "db.product-service.find({ $and: [ {name:/.*akash.*/}, {name:/.*akash.*/} ] }).pretty()")
	List<Product> serach(String searchString);
}
