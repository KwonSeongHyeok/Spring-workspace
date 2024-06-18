package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.khmall.dto.Drinks;
import com.khmall.service.DrinksService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DrinksController {

	@Autowired
	private DrinksService drinksService;
	
	@PostMapping("/register-drink")
	public String insertDrink(Drinks drinks, Model model) {
		drinksService.insertDrink(drinks);
		model.addAttribute("msg", "음료가 성공적으로 등록됐습니다.");
		
		List<Drinks> drinkList = drinksService.getAllDrink();
		log.info("음료전체목록 : " + drinkList);
		model.addAttribute("drinkList", drinkList);
		
		return "drinkList";
		
	}
	
}
