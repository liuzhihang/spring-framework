package com.liuzhihang;

import com.liuzhihang.service.imp.NotesServiceImpl;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * @author liuzhihang
 * @date 2020/11/30 19:34
 */
public class GroovyConfigApplicationTest {

	public static void main(String[] args) {

		GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("SpringConfig.groovy");

		System.out.println(context.getBean(NotesServiceImpl.class));

	}

}
