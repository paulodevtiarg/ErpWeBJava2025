package br.com.elariserp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
		@GetMapping("/")
		public String index() {
			return "home/index";
		}
		
		@GetMapping("/home")
		public String home() {
			return "home/index";
		}
		
		@GetMapping("/index.html")
		public String redirectIndex() {
		    return "redirect:/";
		}
}
