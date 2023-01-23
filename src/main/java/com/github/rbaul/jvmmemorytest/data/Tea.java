package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tea {
	
	private String teaSetName;
	private int countOfTeaBags;
	private int countOfTeaFlavors;
	private int countOfBlackTeaBags;
	private int countOfGreenTeaBags;
	private int countOfHerbalTeaBags;
	private int countOfOolongTeaBags;
	private int teaSetPrice;
	private int discountCoupon = 100;
	
}