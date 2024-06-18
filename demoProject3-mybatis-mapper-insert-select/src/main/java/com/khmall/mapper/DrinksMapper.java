package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Drinks;

@Mapper
public interface DrinksMapper {
	void insertDrink(Drinks drinks);
	
	List<Drinks> getAllDrink();
}
