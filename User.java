package com.jivko.ls.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;


@Entity
public abstract class User implements Serializable{
	private static final long serialVersionUID = 1L;
	final String username = "";
	final String password = "";
	
	private List<Post> posts;
	
	public User(String username, String password) {
	}

	public List<Post> getPosts() {
		if (null == posts) {
			posts = new ArrayList<>();
		}
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public void addPost(Post post) {
		getPosts().add(post);
	}
}
