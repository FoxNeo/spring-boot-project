package com.foxneo.spring.web.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(name = "text", required = false, defaultValue = "No param") String text,
			Model model) {
		model.addAttribute("result", "The text send is: " + text);
		return "params/show";
	}

	@GetMapping("/mix-params")
	public String param(@RequestParam String greet, @RequestParam Integer number, Model model) {
		model.addAttribute("result", "The text send is: " + greet + " 'and the number is " + number);
		return "params/show";
	}

	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String greet = request.getParameter("greet");
		Integer number = null;
		try {
			number = Integer.parseInt(request.getParameter("number"));
		} catch (NumberFormatException e) {
			number =  0;
		}
		model.addAttribute("result", "The text send is: " + greet + " 'and the number is " + number);
		return "params/show";
	}
}
