package my.personal.project.portal_middleware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String test() {
		return "this is index page";
	}

	
	@GetMapping("/user")
	public String userPage()
	{
		return "User Page";
	}
}
