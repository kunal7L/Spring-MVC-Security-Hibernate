package com.mkyong.users.dao;

import com.mkyong.users.model.Users;

public interface UserDao {

	Users findByUserName(String username);

}