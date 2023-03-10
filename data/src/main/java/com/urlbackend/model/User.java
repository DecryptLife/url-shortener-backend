package com.urlbackend.model;

public class User {

	
	private long id;
	private String first_name;
	private String last_name;
	private String email_id;
	private String user_type;
	
	public User(long id, String first_name, String last_name, String email_id, String user_type) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.user_type = user_type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
	
	
}
