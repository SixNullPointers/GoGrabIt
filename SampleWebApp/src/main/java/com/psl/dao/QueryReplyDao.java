package com.psl.dao;

import com.psl.bean.QueryReplyDetails;

public interface QueryReplyDao {

	void insertQueryReply(QueryReplyDetails reply);
	QueryReplyDetails getQueryReply(int replyId);
	void updateQueryReply(QueryReplyDetails reply);
	void deleteQueryReply(QueryReplyDetails reply);
	
}
