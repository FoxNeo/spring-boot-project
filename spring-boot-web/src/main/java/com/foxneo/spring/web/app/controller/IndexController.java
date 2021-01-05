package com.foxneo.spring.web.app.controller;

import java.util.Arrays;
import java.util.List;

import com.foxneo.spring.web.app.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${text.indexcontroller.index.title}")
	private String textIndex;
	
	@Value("${text.indexcontroller.index.profile}")
	private String textProfile;
	
	@Value("${text.indexcontroller.index.list}")
	private String textList;
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textIndex);
		return "index";
	}

	@RequestMapping("/profile")
	public String profile(Model model) {
		User user = new User();
		user.setName("Halo");
		user.setSurname("Infinite");
		user.setEmail("mail@mail.de");
		model.addAttribute("user", user);
		model.addAttribute("titulo", textProfile.concat(user.getName()));
		return "profile";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("titulo", textList);
		return "list";
	}

	@ModelAttribute("users")
	public List<User> fillUsers(){
		List<User> users = Arrays.asList(new User("Miggy", "kira", "mail@mail.jp"),
				new User("kazumi", "telus", "mail@mail.jp"), new User("Osaka", "Usagi", "mail@mail.jp"));
		return users;
	}

}
