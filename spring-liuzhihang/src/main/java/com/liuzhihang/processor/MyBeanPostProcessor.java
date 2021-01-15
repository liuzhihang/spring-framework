package com.liuzhihang.processor;

import com.liuzhihang.component.UserComponent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2021/1/1 18:45
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof UserComponent) {

			System.out.println("BeanPostProcessor 开始执行 初始化前..." + beanName);

			UserComponent userComponent = (UserComponent) bean;
			userComponent.setUserName("liuzhihang-postProcessBeforeInitialization");

			return userComponent;

		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {


		if (bean instanceof UserComponent) {

			System.out.println("BeanPostProcessor 开始执行 初始化后..." + beanName);

			UserComponent userComponent = (UserComponent) bean;
			userComponent.setUserName("liuzhihang-postProcessAfterInitialization");

			return userComponent;

		}

		return bean;
	}
}
