package com.libedi.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ThymeleafController {
	
	@Data
	@Builder
	static class User {
		private final String username;
		private final String address;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		return "redirect:hello";
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
	public void text(Model model) {
		model.addAttribute("user", User.builder().username("Sang jun, Park").address("Suwon city").build());
	}
	
	@GetMapping("/layout-content")
	public void layoutContent(Model model) {
		model.addAttribute("title", "This is a title message.");
		model.addAttribute("headerMsg", "This is a header message.");
		model.addAttribute("contentMsg", "This is a content message.");
		model.addAttribute("footerMsg", "This is a footer message.");
	}
	
	@GetMapping("/date")
	public void date(Model model) {
		model.addAttribute("standardDate", new Date());
		model.addAttribute("localDateTime", LocalDateTime.now());
		model.addAttribute("localDate", LocalDate.now());
		model.addAttribute("timestamp", Instant.now());
	}
	
	@GetMapping("/ajax")
	public void ajax(Model model) {}
	
	@GetMapping("/ajax-result")
	public String ajaxResult(Model model) {
		log.info("ajax-result");
		model.addAttribute("resultList", Arrays.asList(
				User.builder().username("user1").address("address1").build(),
				User.builder().username("user2").address("address2").build()
				));
		// ajaxResult.html 페이지의  list fragment를 찾는다.
		return "ajaxResult :: list";
	}
	
	@PostMapping("/test-enum")
	@ResponseBody
	public void enumTest(@RequestBody final TestDto testDto) {
		log.info(testDto.toString());
	}
}
