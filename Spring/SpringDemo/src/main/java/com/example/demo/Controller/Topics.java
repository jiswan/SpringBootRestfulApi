package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topics {
	
	@RequestMapping("/topics")
	public String getAlltopics()
	{
		return "All Topics";
	}

}
