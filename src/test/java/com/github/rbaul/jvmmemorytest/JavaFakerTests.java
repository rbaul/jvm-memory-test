package com.github.rbaul.jvmmemorytest;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class JavaFakerTests {
	
	@Test
	void test_1() {
		Faker faker = new Faker();
		System.out.println(faker.team());
	}
}
