package com.example.demo.Service;

import java.util.List;

import com.example.demo.Repository.TopicRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Topic;

@Service
public class TopicServices {
	//@Autowired
	private TopicRepository topicRepository;

/*
	private List<Topic> topic = new ArrayList<>(Arrays.asList(new Topic("Spring", "SpringFramework", "SpringDescription"),
			new Topic("Java", "CoreJava", "CoreJava  Description"),
			new Topic("JavaScript", "JavaScript", "JavaScript Description")));
*/
	public List<Topic> getAllTopic() {
		return topicRepository.findAll();

	}
	public Topic getTopic(String id)
	{
		return topicRepository.findById(id);
	}
/*
	public Topic getTopic(String id) {
		return topic.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic2) {
		topic.add(topic2);
		
	}

	public Topic updateTopic(Topic topic2, String id) {
		for(int i =0;i<topic.size();i++)
		{
			Topic t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, topic2);
				return topic.get(i); 
			}
		}
		
		return null;
	}*/
}
