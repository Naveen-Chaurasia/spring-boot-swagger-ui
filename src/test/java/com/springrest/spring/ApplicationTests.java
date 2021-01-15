package com.springrest.spring;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springrest.spring.entities.Course;
import com.springrest.spring.services.CourseService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private CourseService courseService;
	
	@Test
	void contextLoads() {
		
	}

	@Test
	void testCSGetCourses() {
		List<Course> listCources= courseService.getCourses();
		System.out.println("listCources:"+listCources);
		assertNotNull(listCources);
		
	}
}
