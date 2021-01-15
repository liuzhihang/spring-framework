package com.liuzhihang.component;

import javax.swing.*;

/**
 * @author liuzhihang
 * @date 2020/12/27 12:16
 */
public class OrderComponent {

	private Spring orderNo;

	private String source;

	public Spring getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Spring orderNo) {
		this.orderNo = orderNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "OrderComponent{" +
				"orderNo=" + orderNo +
				", source='" + source + '\'' +
				'}';
	}
}
