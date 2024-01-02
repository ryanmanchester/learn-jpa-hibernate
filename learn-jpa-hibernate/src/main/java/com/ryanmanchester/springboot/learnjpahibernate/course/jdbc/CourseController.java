package com.ryanmanchester.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class CourseController {
	
	@Autowired
	private CourseJDBCRepository courseRepository;
	
	@PostMapping(path="/courses")
	public @ResponseBody String addNewCourse(@RequestParam long id, @RequestParam String name,@RequestParam String author) {
		Course course = new Course(id, name, author);
		courseRepository.save(course);
		
		return "Course Saved!";
	}
	
	@GetMapping(path="/courses")
	public @ResponseBody Iterable<Course> getCourses() {
		return courseRepository.findAll();
	}
}
