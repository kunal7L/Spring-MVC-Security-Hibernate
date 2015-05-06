package com.mkyong.users.service;

import com.mkyong.users.model.Users;

public interface UserService {

	Users findByUserName(String username);

}