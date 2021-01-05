package com.foxneo.spring.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/var")
public class RouteController {
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("title", "Get all params (@PathVariable)");
		return "var/index";
	}
	
	@GetMapping("/string/{text}")
	public String variables(@PathVariable String text, Model model)
	{
		model.addAttribute("title", "Get all params (@PathVariable)");
		model.addAttribute("result", "The text send is: " + text);
		return "var/show";
	}

	@GetMapping("/string/{text}/{number}")
	public String variables(@PathVariable String text, @PathVariable Integer number, Model model)
	{
		model.addAttribute("title", "Get all params (@PathVariable)");
		model.addAttribute("result", "The text send is: " + text + " sent number: " + number);
		return "var/show";
	}
	
}
