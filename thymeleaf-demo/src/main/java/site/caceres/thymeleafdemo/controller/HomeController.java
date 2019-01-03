package site.caceres.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Miguel Caceres This is the Controller for the home page
 */
@Controller
public class HomeController {

	@GetMapping("/home")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		return "home";
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
