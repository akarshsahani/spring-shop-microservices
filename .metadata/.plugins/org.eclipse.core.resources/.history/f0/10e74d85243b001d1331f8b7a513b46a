package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {
	
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	
	private String category;
	private String modelNumber;
	private String color;
	private int soldCount;
	private double rating;
	private Date lunchedYear;
	private Date postedDateAndTime;
	private List tags = new ArrayList();
	
	
	

	public ProductResponse(String id, String name, String description, BigDecimal price, String category, String modelNumber,
			String color, int soldCount, double rating, Date lunchedYear, Date postedDateAndTime, List tags) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.modelNumber = modelNumber;
		this.color = color;
		this.soldCount = soldCount;
		this.rating = rating;
		this.lunchedYear = lunchedYear;
		this.postedDateAndTime = postedDateAndTime;
		this.tags = tags;
	}

	public static ProductResponseBuilder builder() {
 		return new ProductResponseBuilder();
 	}
	
	public static class ProductResponseBuilder<T> {
		private String id;
		private String name;
		private String description;
		private BigDecimal price;
		
		private String category;
		private String modelNumber;
		private String color;
		private int soldCount;
		private double rating;
		private Date lunchedYear;
		private Date postedDateAndTime;
		private List tags = new ArrayList();
 		
 		private ProductResponseBuilder() {}
 		
 		public ProductResponseBuilder id(String id) {
 			this.id = id;
 			return this;
 		}
 		
 		public ProductResponseBuilder name(String name) {
 			this.name = name;
 			return this;
 		}
 		
 		public ProductResponseBuilder description(String description) {
 			this.description = description;
 			return this;
 		}
 		
 		public ProductResponseBuilder price(BigDecimal price) {
 			this.price = price;
 			return this;
 		}
 		
 		public ProductResponseBuilder category(String category) {
 			this.category = category;
 			return this;
 		}
 		
 		public ProductResponseBuilder modelNumber(String modelNumber) {
 			this.modelNumber = modelNumber;
 			return this;
 		}
 		
 		public ProductResponseBuilder color(String color) {
 			this.color = color;
 			return this;
 		}
 		
 		public ProductResponseBuilder soldCount(int soldCount) {
 			this.soldCount = soldCount;
 			return this;
 		}
 		
 		public ProductResponseBuilder rating(double rating) {
 			this.rating = rating;
 			return this;
 		}
 		
 		public ProductResponseBuilder lunchedYear(Date lunchedYear) {
 			this.lunchedYear = lunchedYear;
 			return this;
 		}
 		
 		public ProductResponseBuilder postedDateAndTime(Date postedDateAndTime) {
 			this.postedDateAndTime = postedDateAndTime;
 			return this;
 		}
 		
 		public ProductResponseBuilder tags(List tags) {
 			this.tags = tags;
 			return this;
 		}
 		
 		
 		@java.lang.Override public String toString() {
 			return "ProductBuilder(id = " + id + ", name = " + name + ", description = " + description + ", price = " + price + ", category = " + category + ", modelNumber = " + modelNumber + ", color = " + color + ", soldCount = " + soldCount + ", rating = " + rating + ", lunchedYear = " + lunchedYear + ", postedDateAndTime = " + postedDateAndTime + ", tags = " + tags + ")";
 		}
 		
 		
 		
 		public ProductResponse build() {
 			return new ProductResponse(id, name, description, price, category, modelNumber, color, soldCount, rating, lunchedYear, postedDateAndTime, tags);
 		}
 	}

	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getSoldCount() {
		return soldCount;
	}

	public void setSoldCount(int soldCount) {
		this.soldCount = soldCount;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getLunchedYear() {
		return lunchedYear;
	}

	public void setLunchedYear(Date lunchedYear) {
		this.lunchedYear = lunchedYear;
	}

	public Date getPostedDateAndTime() {
		return postedDateAndTime;
	}

	public void setPostedDateAndTime(Date postedDateAndTime) {
		this.postedDateAndTime = postedDateAndTime;
	}

	public List getTags() {
		return tags;
	}

	public void setTags(List tags) {
		this.tags = tags;
	}




}
