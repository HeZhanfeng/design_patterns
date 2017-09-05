package com.kcn.create.simple_factory.interfaces.impl;

import com.kcn.create.simple_factory.interfaces.Cpu;

/**
 * <p>Title: AmdCpu</p>
 * <p>Description: AMD对CPU接口的实现类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:16:40
 * @version 1.0
 */
public class AmdCpu implements Cpu {

	/**  
	* @Fields CPU的针脚数  
	*/  
	private int pins = 0;
	
	public AmdCpu(int pins){
		
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("AMD CPU的针脚数：" + pins);
	}

}
