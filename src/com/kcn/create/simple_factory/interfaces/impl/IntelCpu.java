package com.kcn.create.simple_factory.interfaces.impl;

import com.kcn.create.simple_factory.interfaces.Cpu;

/**
 * <p>Title: IntelCpu</p>
 * <p>Description: Intel对CPU接口的实现类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:15:32
 * @version 1.0
 */
public class IntelCpu implements Cpu{
	
	
	/**  
	* @Fields CPU的针脚数  
	*/  
	private int pins = 0;
	
	public IntelCpu(int pins) {
		
		this.pins = pins;
	}
	
	@Override
	public void calculate() {
		
		System.out.println("Intel CPU的针脚数：" + pins);
	}

}
