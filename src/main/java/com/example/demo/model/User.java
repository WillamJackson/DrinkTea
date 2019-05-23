package com.example.demo.model;

public class User {
	String username;
	String password;
	String patternLock;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatternLock() {
		return patternLock;
	}

	public void setPatternLock(String patterLock) {
		this.patternLock = patterLock;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", patterLock='"
				+ patternLock + '\'' + '}';
	}
}
