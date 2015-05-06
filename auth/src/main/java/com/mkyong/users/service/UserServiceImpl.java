package com.mkyong.users.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.users.dao.UserDao;
import com.mkyong.users.model.Users;


@Service
public class UserServiceImpl implements UserService {
	
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


	@Override
	@Transactional
	public Users findByUserName(String username) {
		this.userDao.findByUserName(username);
		return null;
	}

}