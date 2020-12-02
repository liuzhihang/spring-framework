package com.liuzhihang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuzhihang
 * @date 2020/11/30 19:16
 */
public class XmlConfigApplicationTest {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		System.out.println(context.getBean("bookService"));

	}

}
