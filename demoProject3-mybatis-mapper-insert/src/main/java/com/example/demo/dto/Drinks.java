package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Drinks {
	private int drinksId;
	private String drinksName;
	private int drinksPrice;
	private int drinksQuantity;
	
}
