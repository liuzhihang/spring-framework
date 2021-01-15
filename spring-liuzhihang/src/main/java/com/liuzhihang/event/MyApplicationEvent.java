package com.liuzhihang.event;

import org.springframework.context.ApplicationEvent;

/**
 * 注册监听器
 *
 * @author liuzhihang
 * @date 2021/1/2 18:37
 */
public class MyApplicationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 5366526231219883438L;
	private String message;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyApplicationEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
