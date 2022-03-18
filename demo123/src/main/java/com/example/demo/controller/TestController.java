package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;

@RestController
public class TestController {

	@Autowired
	MemberService memberService;
	
	@GetMapping(value = "/id")
	public String getId(Model model) {
		MemberDto mem = null;
		try {
			mem = memberService.getMemberId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mem.getId();
	}
}
