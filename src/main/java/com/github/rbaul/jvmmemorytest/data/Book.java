package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	protected long isbn;
	
	protected String title;
	
	protected String author;
	
	protected String code;
	
	protected int amount;
	
}