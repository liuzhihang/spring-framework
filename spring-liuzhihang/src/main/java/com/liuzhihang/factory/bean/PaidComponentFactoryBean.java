package com.liuzhihang.factory.bean;

import com.liuzhihang.component.PaidComponent;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liuzhihang
 * @date 2021/1/4 15:14
 */
@Component
public class PaidComponentFactoryBean implements FactoryBean<PaidComponent> {

	@Override
	public PaidComponent getObject() throws Exception {

		System.out.println("PaidComponentFactoryBean 的 getObject 方法被调用");

		return new PaidComponent();
	}

	@Override
	public Class<?> getObjectType() {
		return PaidComponent.class;
	}

}
