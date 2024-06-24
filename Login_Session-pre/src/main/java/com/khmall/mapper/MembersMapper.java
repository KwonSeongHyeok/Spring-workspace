package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.khmall.dto.Members;

@Mapper
public interface MembersMapper {
	Members getLogin(@Param("email") String email,
					 @Param("password") String password);
}
