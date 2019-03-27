package org.courseapi.topic;



import java.util.Arrays;
import java.util.List;

import org.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
		
		@Autowired
		private TopicService topicService;
		
	
		@RequestMapping("/topics")
		public List<Topic> getAllTopics()
		{
			return topicService.getAllTopics();
					
		}
		
		@RequestMapping("/topics/{id}")
		public Topic getTopic(@PathVariable String id)
		{
			return topicService.getTopic(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody Topic topic)
		{
			topicService.addTopic(topic);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{name}")
		public void updateTopic(@RequestBody Topic topic,@PathVariable String name)
		{
			topicService.updateTopic(name,topic);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{name}")
		public void DeleteTopic(@PathVariable String name)
		{
			topicService.DeleteTopic(name);
		}
		
		
		
}
