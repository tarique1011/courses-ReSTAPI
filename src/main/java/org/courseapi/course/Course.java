package org.courseapi.course;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.courseapi.topic.Topic;

@Entity
public class Course {
	
	

	public Course() {
		
	}
	
	public Course(String id,String name,String url) {
		super();
		this.id=id;
		this.name = name;
		this.url=url;
	}
	
	@Id
	private String id;
	private String name;
	private String url;
	
	@ManyToOne
	private Topic topic;
	
	@JsonIgnore
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
