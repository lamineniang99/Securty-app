package com.domaine.security.dao;

import java.util.List;

import com.domaine.security.entity.UserEntity;

public interface IUserDao extends Repository<UserEntity> {

	List<UserEntity> list(UserEntity t);

}
