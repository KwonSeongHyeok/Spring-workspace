package com.khmall.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.ImageUpload;

@Mapper
public interface ImageUploadMapper {
	// void insertImageUpload(ImageUpload imageUpload);
	/*
	 * Controller에서 paraMap을 Mapper로 전달할 때
	 * imageUploadMapper.insertImageUpload(paraMap);
	 * 
	 * paraMap 맨 앞에
	 * Map<String, Object> paraMap
	 * 
	 * Map과 String Object를 작성해줬기 때문에
	 * Mapper에서도 Map<String, Object>을 붙여줌
	 * 
	 * */
	void insertImageUpload(Map<String, Object> paraMap);
}	

