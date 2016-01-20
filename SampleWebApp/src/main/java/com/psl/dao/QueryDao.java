package com.psl.dao;

import com.psl.bean.Query;

public interface QueryDao {

	void insertQuery(Query query);
	Query getQuery(int queryId);
	void updateQuery(Query query);
	void deleteQuery(Query query);
}
