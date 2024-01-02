package com.ryanmanchester.springboot.learnjpahibernate.course.jdbc;

import org.springframework.data.repository.CrudRepository;


public interface CourseJDBCRepository extends CrudRepository<Course, Integer> {

}
