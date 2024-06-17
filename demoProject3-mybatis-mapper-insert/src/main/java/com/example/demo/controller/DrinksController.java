package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Drinks;
import com.example.demo.service.DrinksService;

@Controller
public class DrinksController {


	@Autowired
	private DrinksService drinkService;
	
	@PostMapping("/drinks-register")
	public String insertDrinks(Drinks drinks, Model model) {
		drinkService.insertDrinks(drinks);
		model.addAttribute("msg", "음료등록이 완료되었습니다.");
		return "successDrink";
	}
}
