package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

	private String name;
	private String description;
	private BigDecimal price;
	
	private String category;
	private String modelNumber;
	private String color;
	private Date lunchedYear;
	private List tags = new ArrayList();
	
	

	public static ProductRequestBuilder builder() {
 		return new ProductRequestBuilder();
	
}

	public static class ProductRequestBuilder<T> {
		private String name;
		private String description;
		private BigDecimal price;
		
		private String category;
		private String modelNumber;
		private String color;
		private Date lunchedYear;
		private List tags = new ArrayList();
 		
 		private ProductRequestBuilder() {}
 		
 		 		
 		public ProductRequestBuilder name(String name) {
 			this.name = name;
 			return this;
 		}
 		
 		public ProductRequestBuilder description(String description) {
 			this.description = description;
 			return this;
 		}
 		
 		public ProductRequestBuilder price(BigDecimal price) {
 			this.price = price;
 			return this;
 		}
 		
 		public ProductRequestBuilder category(String category) {
 			this.category = category;
 			return this;
 		}
 		
 		public ProductRequestBuilder modelNumber(String modelNumber) {
 			this.modelNumber = modelNumber;
 			return this;
 		}
 		
 		public ProductRequestBuilder color(String color) {
 			this.color = color;
 			return this;
 		}
 		
 		
 		
 		public ProductRequestBuilder lunchedYear(Date lunchedYear) {
 			this.lunchedYear = lunchedYear;
 			return this;
 		}
 		
 		 		
 		public ProductRequestBuilder tags(List tags) {
 			this.tags = tags;
 			return this;
 		}
 		
 		
 		@java.lang.Override public String toString() {
 			return "ProductBuilder(name = " + name + ", description = " + description + ", price = " + price + ", category = " + category + ", modelNumber = " + modelNumber + ", color = " + color + ", lunchedYear = " + lunchedYear + ", tags = " + tags + ")";
 		}
 		
 		
 		
 		public ProductRequest build() {
 			return new ProductRequest(name, description, price, category, modelNumber, color, lunchedYear, tags);
 		}
	}


		public ProductRequest(String name, String description, BigDecimal price, String category,
				String modelNumber, String color, Date lunchedYear, List tags) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
			this.category = category;
			this.modelNumber = modelNumber;
			this.color = color;
			this.lunchedYear = lunchedYear;
			this.tags = tags;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public BigDecimal getPrice() {
			return price;
		}


		public void setPrice(BigDecimal price) {
			this.price = price;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public String getModelNumber() {
			return modelNumber;
		}


		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public Date getLunchedYear() {
			return lunchedYear;
		}


		public void setLunchedYear(Date lunchedYear) {
			this.lunchedYear = lunchedYear;
		}


		public List getTags() {
			return tags;
		}


		public void setTags(List tags) {
			this.tags = tags;
		} 
 		
	
 		
 	}