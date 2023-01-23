package com.github.rbaul.jvmmemorytest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private int rollNo;
	private String name;
	private int studentId;
	
	private int batchNo;
	private String courseName;
	private boolean isEnrolled;
	private int age;
	
}