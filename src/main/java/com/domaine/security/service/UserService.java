package com.domaine.security.service;

import java.util.List;

import com.domaine.security.dao.IUserDao;
import com.domaine.security.dao.UserDao;
import com.domaine.security.dto.UserDto;
import com.domaine.security.entity.UserEntity;
import com.domaine.security.mapper.UserMapper;

public class UserService implements IUserService {

	private IUserDao userDao = (IUserDao) new UserDao() ;
	
	@Override
	public List<UserDto> getAll() {
		
		return UserMapper.listUserEntityToListUserDto(userDao.list(new UserEntity())) ;
	}

	

	
}
