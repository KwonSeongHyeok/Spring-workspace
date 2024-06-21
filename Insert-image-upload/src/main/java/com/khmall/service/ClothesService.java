package com.khmall.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Clothes;
import com.khmall.mapper.ClothesMapper;

@Service
public class ClothesService {
	
	@Autowired
	private ClothesMapper clothesMapper;
	
	public List<Clothes> getAllClothes(){
		return clothesMapper.getAllClothes();
	}
	
	public void uploadClothes(String clothes_name, int clothes_price, String clothes_category, MultipartFile file) {
		String fileName = file.getOriginalFilename();
		
		String uploadDir = "C:/Users/user1/Spring-workspace/demoProject3-mybatis-mapper-select-image/src/main/resources/static/images/clothes/";
		
		File imgFolder = new File(uploadDir); //폴더 만드는 파일
		
		
		if(!imgFolder.exists()) {
			imgFolder.mkdirs();
			}
		
		File imgFile = new File(imgFolder + fileName); // folder 안에 jpg 
		
		try {
			file.transferTo(imgFile);
			
			Clothes clothes = new Clothes();
			clothes.setClothes_name(clothes_name);
			clothes.setClothes_price(clothes_price);
			clothes.setClothes_category(clothes_category);
			clothes.setClothes_image_path("/images/clothes/" + fileName);
			
			clothesMapper.uploadClothes(clothes);
			System.out.println("등록 service를 성공적으로 완료했습니다.");
			
		}  catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
