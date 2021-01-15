package com.liuzhihang.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzhihang
 * @date 2021/1/13 18:17
 */
@Service
public class CircularServiceB {

	@Autowired
	private CircularServiceC circularServiceC;
}
