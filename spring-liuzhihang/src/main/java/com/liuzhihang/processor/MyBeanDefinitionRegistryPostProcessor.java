package com.liuzhihang.processor;

import com.liuzhihang.component.OrderComponent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2020/12/27 12:12
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 修改 BeanDefinition 信息
		// BeanDefinition userComponentBeanDefinition = beanFactory.getBeanDefinition("userComponent");
		// userComponentBeanDefinition.setLazyInit(true);

		// 修改 Bean 的信息
		// xxx 非常不推荐 beanFactory.getBean 过早的实例化 Bean
		// UserComponent bean = beanFactory.getBean(UserComponent.class);
		// bean.setUserName("liuzhihang-01");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		// 注册一个 BeanDefinition
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(OrderComponent.class);

		AbstractBeanDefinition orderComponentBeanDefinition = builder.getBeanDefinition();

		registry.registerBeanDefinition("orderComponent", orderComponentBeanDefinition);

	}
}
