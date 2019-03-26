package org.courseapi.course;



import java.util.Arrays;
import java.util.List;

import org.courseapi.course.Course;
import org.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
		
		@Autowired
		private CourseService courseService;
		
	
		@RequestMapping("/topics/{topicid}/courses")
		public List<Course> getAllCourses(@PathVariable String topicid)
		{
			return courseService.getAllCourses(topicid);
					
		}
		
		@RequestMapping("/topics/{topicid}/courses/{courseid}")
		public Course getCourse(@PathVariable String courseid)
		{
			return courseService.getCourse(courseid);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/topics/{topicid}/courses")
		public void addCourse(@RequestBody Course course,@PathVariable String topicid)
		{
			course.setTopic(new Topic(topicid,""));
			courseService.addCourse(course);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicid}/courses/{courseid}")
		public void updateCourse(@RequestBody Course course,@PathVariable String topicid,
				@PathVariable String courseid)
		{
			course.setTopic(new Topic(topicid,""));
			courseService.updateCourse(course);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicid}/courses/{courseid}")
		public void DeleteCourse(@PathVariable String courseid)
		{
			courseService.DeleteCourse(courseid);
		}
		
		
		
}
