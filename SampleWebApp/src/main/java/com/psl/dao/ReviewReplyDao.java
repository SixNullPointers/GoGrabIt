package com.psl.dao;

import com.psl.bean.ReviewReplyDetails;

public interface ReviewReplyDao {
	void insertReviewReply(ReviewReplyDetails reply);
	ReviewReplyDetails getReviewReply(int replyId);
	void updateReviewReply(ReviewReplyDetails reply);
	void deleteReviewReply(ReviewReplyDetails reply);
}
