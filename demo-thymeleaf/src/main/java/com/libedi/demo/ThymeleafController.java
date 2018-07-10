package com.libedi.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
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
}
