package fr.isika.al14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllerweb {
	
	private String name = "";
	private String message;

	@GetMapping("/index")
	public String index (Model model)
	{
		return "page";
		
	}
	
	@PostMapping("/name")
	public String submit(Model m, String name) {
		message = "Bonjour " + name + " vous êtes bien matinal !";
		return "page";
	}
	
	@PostMapping("/post")
	public String post(@RequestParam("p1") String p1,Model model)
	{
		model.addAttribute("P1",p1);

		return "page1";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
