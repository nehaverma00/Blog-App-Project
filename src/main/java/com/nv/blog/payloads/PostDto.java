package com.nv.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class PostDto {

	private Integer postId;

	private String title;
	private String content;
	private String imageURL;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments = new HashSet<>();

	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}

	public PostDto(Set<CommentDto> comments) {
		super();

		this.comments = comments;
	}

	public PostDto() {
		super();
	}

	public PostDto(Integer postId) {
		super();
		this.postId = postId;
	}

	public PostDto(String title, String content, String imageURL, Date addedDate, CategoryDto category, UserDto user) {
		super();
		this.title = title;
		this.content = content;
		this.imageURL = imageURL;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

}
