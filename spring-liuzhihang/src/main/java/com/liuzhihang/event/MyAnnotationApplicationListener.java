package com.liuzhihang.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2021/1/2 18:59
 */
@Component
public class MyAnnotationApplicationListener {

	@EventListener(classes = MyApplicationEvent.class)
	public void myApplicationEventListener(MyApplicationEvent event) {

		System.out.println("使用注解的方式, 收到事件: " + event.getMessage());
	}
}
