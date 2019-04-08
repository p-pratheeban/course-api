package com.pratheeban.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pratheeban.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring Framework", "Spring framework description."),
			new Topic(2, "Core Java", "Core Java description."), new Topic(3, "Core PHP", "Core PHP description.")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(Integer id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Integer id, Topic topic) {
		for (Topic t : topics) {
			if (t.getId().equals(id)) {
				t.setName(topic.getName());
				return;
			}
		}
	}

	public void deleteTopic(Integer id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
