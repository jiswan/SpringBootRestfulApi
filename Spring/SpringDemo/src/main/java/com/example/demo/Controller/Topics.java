package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Topic;
import com.example.demo.Service.TopicServices;

@RestController
public class Topics {

	@Autowired
	private TopicServices topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAlltopics() {
		return topicservice.getAllTopic();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}

}
