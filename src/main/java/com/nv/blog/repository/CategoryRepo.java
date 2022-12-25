package com.nv.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.blog.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
