package com.liuzhihang.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2020/12/27 11:39
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("BeanFactoryPostProcessor 开始执行...");

		// 修改 BeanDefinition 信息
		BeanDefinition userComponentBeanDefinition = beanFactory.getBeanDefinition("userComponent");
		userComponentBeanDefinition.setLazyInit(true);

		MutablePropertyValues userComponentPropertyValues = userComponentBeanDefinition.getPropertyValues();

		userComponentPropertyValues.addPropertyValue("userName", "liuzhihang-02");


		// 修改 Bean 的信息
		// xxx 非常不推荐 beanFactory.getBean 过早的实例化 Bean
		// UserComponent bean = beanFactory.getBean(UserComponent.class);
		// bean.setUserName("liuzhihang-01");


	}
}
