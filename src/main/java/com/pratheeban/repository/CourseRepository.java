package com.pratheeban.repository;

import org.springframework.data.repository.CrudRepository;

import com.pratheeban.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	public List<Course> getCourseByName(String name);

	public List<Course> findByTopicId(Integer topicId);

	public List<Course> getCourseByTopic(Integer topicId);
}