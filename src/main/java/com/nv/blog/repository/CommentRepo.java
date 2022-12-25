package com.nv.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.blog.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
