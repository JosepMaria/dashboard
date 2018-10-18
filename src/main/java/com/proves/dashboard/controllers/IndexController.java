package com.proves.dashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value={"","/","index"})
	public String index() {
		return "index";
	}
	
	@GetMapping("order")
	public String order(Model model) {
		return "order";
	}
	
	@GetMapping("product")
	public String product() {
		return "product";
	}
	
	@GetMapping("customer")
	public String customer() {
		return "customer";
	}
	

}