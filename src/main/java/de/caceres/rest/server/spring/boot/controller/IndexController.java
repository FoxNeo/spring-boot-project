package de.caceres.rest.server.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Miguel Caceres, Bremen Germany 2018
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	String home() {
		return "index";
	}

}
