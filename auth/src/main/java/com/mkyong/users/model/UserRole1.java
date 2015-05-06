package com.mkyong.users.model;

public class UserRole1 {

	private Integer userRoleId;
	private User1 user;
	private String role;

	public UserRole1() {
	}

	public UserRole1(User1 user, String role) {
		this.user = user;
		this.role = role;
	}

	public Integer getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User1 getUser() {
		return this.user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
