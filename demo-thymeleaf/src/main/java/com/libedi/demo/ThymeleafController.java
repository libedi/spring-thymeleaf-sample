package com.libedi.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Builder;
import lombok.Data;

@Controller
public class ThymeleafController {
	
	@Data
	@Builder
	static class User {
		private String username;
		private String address;
	}
	
	@GetMapping("/hello")
	public void hello(Model model) {
		model.addAttribute("msg", "Hello, Thymeleaf World.");
	}
	
	@GetMapping("/loop")
	public void loop(Model model) {
		List<String> list = Arrays.asList("TEST1", "TEST2", "TEST3", "TEST4", "TEST5");
		model.addAttribute("list", list);
	}
	
	@GetMapping("/condition")
	public void conditional(Model model) {
		model.addAttribute("trueCondition", true);
		model.addAttribute("falseCondition", false);
		model.addAttribute("switchCase", "case1");
	}
	
	@GetMapping("/text")
	public void text1(Model model) {
		model.addAttribute("user", User.builder().username("Sang jun, Park").address("Suwon city").build());
	}
}
