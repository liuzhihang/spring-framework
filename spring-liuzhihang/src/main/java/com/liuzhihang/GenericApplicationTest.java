package com.liuzhihang;

import com.liuzhihang.service.imp.NotesServiceImpl;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author liuzhihang
 * @date 2020/11/30 20:40
 */
public class GenericApplicationTest {

	public static void main(String[] args) {

		GenericApplicationContext context = new GenericApplicationContext();

		new XmlBeanDefinitionReader(context).loadBeanDefinitions("SpringConfig.xml");
		new GroovyBeanDefinitionReader(context).loadBeanDefinitions("SpringConfig.groovy");

		context.refresh();

		System.out.println(context.getBean("bookService"));
		System.out.println(context.getBean(NotesServiceImpl.class));

	}
}
