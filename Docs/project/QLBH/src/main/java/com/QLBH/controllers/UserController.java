package com.QLBH.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/") 
	public String home() {
		return "Login";
	}
	@GetMapping("/Login.html") 
	public String Login() {
		return "Login";
	}
	@GetMapping("/DangkiTK.html") 
	public String DKTK() {
		return "DangkiTK";
	}
}
