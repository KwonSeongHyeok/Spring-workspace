package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.CafeDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("cafe")
@Slf4j
public class CafeController {

	/*
	@PostMapping("comment")
	public String cafeMainComment(@RequestParam("cafeCommentName") String cafeCommentName,
								  @RequestParam("cafeCommentOpinion") String cafeCommentOpinion
			) {
		
		log.info("카페 메인으로 이동하기");
		log.debug("cafeCommentName : " + cafeCommentName);
		log.debug("cafeCommentOpinion : " + cafeCommentOpinion);
		
		
		return "redirect:/cafe/cafe_index";
	}
	*/
	
	// CafeDTO cafe-board
	
	// ->@PostMapping("cafe_index") ModelAttribute 받아오기
	@PostMapping("comment")
	public String cafeIndexComment(CafeDTO cafeDTo) {
		CafeDTO cd = new CafeDTO();
		cd.getCafeCommentName();
		cd.getCafeCommentOpnion();
		
		cd.setCafeCommentName("넣어줄 값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		cd.setCafeCommentOpnion("넣어줄 값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		
		return "redirect:/cafe/cafe_index";
	}
	
	
}
