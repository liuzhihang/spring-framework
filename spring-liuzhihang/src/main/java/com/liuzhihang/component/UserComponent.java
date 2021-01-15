package com.liuzhihang.component;

import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2020/11/26 16:36
 */
@Component
public class UserComponent {


	private String userId = "1";

	private String userName = "liuzhihang";


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserComponent{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
