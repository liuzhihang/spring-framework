package com.liuzhihang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liuzhihang
 * @date 2020/11/26 16:32
 */
public class AnnotationConfigApplicationTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(JavaConfig.class);
		context.refresh();

		System.out.println(context.getBean(UserComponent.class));

	}
}
