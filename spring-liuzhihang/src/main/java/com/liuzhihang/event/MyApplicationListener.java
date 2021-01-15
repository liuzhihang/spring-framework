package com.liuzhihang.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2021/1/2 18:41
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {

		System.out.println("MyApplicationListener 收到消息: " + event.getMessage());

	}
}
