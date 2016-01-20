package com.psl.dao;

import com.psl.bean.Review;

public interface ReviewDao {

	void insertReview(Review review);
	Review getReview(int reviewId);
	void updateReview(Review review);
	void deleteReview(Review review);
	
}
