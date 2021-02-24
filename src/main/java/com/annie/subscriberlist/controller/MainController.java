package com.annie.subscriberlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	@RequestMapping("/about.html")
	public String about() {
		return "about.html";
	}
}