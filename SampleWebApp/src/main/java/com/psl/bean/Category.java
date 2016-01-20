package com.psl.bean;


//@Entity
//@Table(name = "CATEGORY")
public class Category {

	//@Id
	//@GeneratedValue
	private int categoryId;

	private String categoryName;

	public Category() {
	}

	

	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
