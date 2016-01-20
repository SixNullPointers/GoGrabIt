package com.psl.dao;

import com.psl.bean.Login;

public interface LoginDao {
	void insertLogin(Login login);
	Login getLogin(int loginNo);
	void updateLogin(Login login);
	void deleteLogin(Login login);
}
