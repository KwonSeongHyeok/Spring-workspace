package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Clothes;
import com.khmall.service.ClothesService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ClothesController {
	@Autowired
	private ClothesService clothesService;
	
	@GetMapping("/")
	public String getAllClothes(Model model) {
		List<Clothes> clothes = clothesService.getAllClothes();
		model.addAttribute("clothes", clothes);
		log.info("확인" + clothes);
		return "index";
	}
	
	/***** 옷 정보를 올릴 수 있는 주소로 이동하는 GetMapping 작성 *****/
	@GetMapping("/clothesUpload")
	public String uploadForm(Model model) {
		model.addAttribute("c", new Clothes());
		return "clothesUpload";
	}
	
	/***** 옷 정보 db에 업로드 PostMapping *****/
	@PostMapping("/upload")
	public String uploadClothes(
			@RequestParam("clothes_name") String clothes_name,
			@RequestParam("clothes_price") int clothes_price,
			@RequestParam("clothes_category") String clothes_category,
			@RequestParam("clothes_image_path") MultipartFile file,
			Model model) {
		
		clothesService.uploadClothes(clothes_name, clothes_price, clothes_category, file);
		log.info("uploadClothes 확인");
		return "redirect:/";
	}
	
}
