package com.shopme.site;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
}
