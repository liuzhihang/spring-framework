package com.liuzhihang.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzhihang
 * @date 2021/1/13 18:18
 */
@Service
public class CircularServiceC {

	@Autowired
	private CircularServiceA circularServiceA;

}
