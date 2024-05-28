package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class MainController {
	
	@RequestMapping("/index")
	public String getIndexPage() {
		return "index";
	}
}
