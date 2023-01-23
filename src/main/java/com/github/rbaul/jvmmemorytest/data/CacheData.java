package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CacheData {
	
	private Person person;
	
	private Barrier barrier;
	
	private Student student;
	
	private Tea tea;
	
	private Book book;
}
