package com.nv.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDto {

	private int userId;

	@NotEmpty
	@Size(min = 4, message = "User name must be min 4 charecters !!")
	private String name;

	@Email
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "Password contains min 3 charecters and max 10 charecters!!")
	private String password;

	@NotEmpty
	private String about;

	public UserDto() {
		super();
	}

	public UserDto(int userId, String name, String email, String password, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.about = about;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
