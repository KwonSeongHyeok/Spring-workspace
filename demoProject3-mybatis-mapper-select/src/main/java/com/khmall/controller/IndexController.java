package com.khmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Member;

@Controller
public class IndexController {

	@GetMapping("/memberRegister")
	public String signUp(Model model) {
		model.addAttribute("member", new Member());
		return "memberRegister";
	}
}
