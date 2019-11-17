package com.openwebinars.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@GetMapping("/user/{user}")
	public String index(@PathVariable String user, @RequestParam(name="name", required=false, defaultValue="John Doe") String name, Model model) {
		model.addAttribute("user", name);
		model.addAttribute("id", user);
		return "user";
	}
}
