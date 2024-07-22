package com.domaine.security.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.domaine.security.dto.UserDto;
import com.domaine.security.entity.UserEntity;

public class UserMapper {

	public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users) {
		return users.stream()
				.map(user -> toUserDto(user))
				.collect(Collectors.toList()) ;
	}
	
	private static UserDto toUserDto(UserEntity user) {
		return new UserDto(user.getId(), user.getNom(), user.getPrenom(), user.getEmail()) ;
	}
}
