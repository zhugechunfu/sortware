package com.service.impl;

import com.dao.UserDao;
import com.dao.UserDaoFactory;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao dao = UserDaoFactory.getInstance();
	@Override
	public void addNewUser(User user) {
		dao.sava(user);
	}

}
