package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Drinks;
import com.khmall.mapper.DrinksMapper;

@Service
public class DrinksService {

	@Autowired
	private DrinksMapper drinksMapper;
	
	public void insertDrink(Drinks drinks) {
		drinksMapper.insertDrink(drinks);
	}
	
	public List<Drinks> getAllDrink(){
		return drinksMapper.getAllDrink();
	}
}
