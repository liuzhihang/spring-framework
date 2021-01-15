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


		// System.out.println(context.getBean("paidComponentFactoryBean"));
		// System.out.println(context.getBean("&paidComponentFactoryBean"));
		// System.out.println(context.getBean(PaidComponent.class));
		// System.out.println(context.getBean(PaidComponentFactoryBean.class));


		// MyApplicationEvent myApplicationEvent = new MyApplicationEvent(context, "呼叫土豆,呼叫土豆!");
		//
		// context.publishEvent(myApplicationEvent);


		// MessageSource messageSource = context.getBean(MessageSource.class);
		//
		// String zhMessage = messageSource.getMessage("user.name", null, null, Locale.CHINA);
		// String enMessage = messageSource.getMessage("user.name", null, null, Locale.ENGLISH);
		//
		// System.out.println("zhMessage = " + zhMessage);
		//
		// System.out.println("enMessage = " + enMessage);

		// System.out.println(context.getBean(UserComponent.class));
		//
		// System.out.println("获取 userComponent " + context.getBean("userComponent"));
		//
		// System.out.println("获取 OrderComponent " + context.getBeanProvider(OrderComponent.class).getIfAvailable());

	}
}
