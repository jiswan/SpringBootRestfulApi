package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Topic;

@Service
public class TopicServices {

	private List<Topic> topic =Arrays.asList(
			new Topic("Spring", "SpringFramework", "SpringDescription"),
			new Topic("Java", "CoreJava", "CoreJava  Description"),
			new Topic("JavaScript", "JavaScript", "JavaScript Description")
			);
	
	public List<Topic> getAllTopic()
	{
		return topic;
	}
	
	public Topic getTopic(String id)
	{
		return topic.stream().filter(x->x.getId().equals(id)).findFirst().get();
	}
}
