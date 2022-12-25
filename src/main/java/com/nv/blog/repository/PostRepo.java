package com.nv.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.blog.entity.Category;
import com.nv.blog.entity.Post;
import com.nv.blog.entity.User;
import com.nv.blog.payloads.PostDto;

public interface PostRepo extends JpaRepository<Post,Integer>{

	List<Post> findByCategory(Category cat);

	List<Post> findByUser(User user);

	List<Post> findByTitleContaining(String keyword);

	

	

}
