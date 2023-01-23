package com.github.rbaul.jvmmemorytest;

import com.github.rbaul.jvmmemorytest.data.Person;
import org.junit.jupiter.api.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class PodamTests {
	
	@Test
	void podamTest() {
		PodamFactory factory = new PodamFactoryImpl();
		Person person = factory.manufacturePojo(Person.class);
		System.out.println(person);
	}
}
