package com.jivko.ls.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jivko.ls.models.Post;

public interface PostRepository extends JpaRepository<Post, String> {

	public List<Post> findByTitle(String title);
	public List<Post> findById(int id);
}
