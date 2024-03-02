package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Topic;

@RestController
public class Topics {
	
	@RequestMapping("/topics")
	public List<Topic> getAlltopics()
	{
		return Arrays.asList(
				new Topic("Spring", "SpringFramework", "SpringDescription"),
				new Topic("Java", "CoreJava", "CoreJava  Description"),
				new Topic("JavaScript", "JavaScript", "JavaScript Description")
				);
	}

}
