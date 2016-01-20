package com.psl.dao;

import com.psl.bean.Product;

public interface ProductDao {
	void insertProduct(Product prod);
	Product getProduct(int prodId);
	void updateProduct(Product prod);
	void deleteProduct(Product prod);
}
