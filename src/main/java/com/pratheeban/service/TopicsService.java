package com.pratheeban.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratheeban.model.Topic;
import com.pratheeban.repository.TopicRepository;

@Service
public class TopicsService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		this.topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(Integer id) {
		return this.topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}

	public void updateTopic(Integer id, Topic topic) {
		this.topicRepository.save(topic);
	}

	public void deleteTopic(Integer id) {
		this.topicRepository.deleteById(id);
	}
}
