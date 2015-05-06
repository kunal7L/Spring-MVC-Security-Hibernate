package com.mkyong.users.model;

import java.util.HashSet;
import java.util.Set;

public class User1{

	private String username;
	private String password;
	private boolean enabled;
	private Set<UserRole1> userRole = new HashSet<UserRole1>(0);

	public User1() {
	}

	public User1(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public User1(String username, String password, boolean enabled, Set<UserRole1> userRole) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole1> getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Set<UserRole1> userRole) {
		this.userRole = userRole;
	}

}
