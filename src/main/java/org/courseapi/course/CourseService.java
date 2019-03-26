package org.courseapi.course;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List<Course> getAllCourses(String topicid)
	{	
		List <Course> Courses=new ArrayList<>();
		courseRepository.findByTopicId(topicid)
				.forEach(Courses::add);
		return Courses;
	}
	
	public Course getCourse(String id)
	{
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course Course) {
		courseRepository.save(Course);
	}

	public void updateCourse(Course Course) {
		courseRepository.save(Course);
		
	}

	public void DeleteCourse(String id) {
		courseRepository.deleteById(id);;
		
		
	}

}
