package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.MemberService;

@SpringBootTest(classes = Demo123ApplicationTests.class)
class Demo123ApplicationTests {

	@Autowired
	MemberService memberService;
	@Test
	void contextLoads() throws Exception {
		assertEquals(0, 0);
		memberService.getMemberId();
	}

	@Test
	void contextLoads1() {
		assertEquals(0, 1);
	}

	@Test
	void contextLoads2() {
		Integer a = 0;
		if( 100 / a > 10 ) {
			
		}
		
		assertEquals(0, 1);
	}

}
