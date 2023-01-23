package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	protected int id;
	
	protected String name;
	
	protected Address address;
	
	protected LocalDate birthDate;
	
	protected String phone;
}
