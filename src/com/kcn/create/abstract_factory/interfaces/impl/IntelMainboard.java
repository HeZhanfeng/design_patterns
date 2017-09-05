package com.kcn.create.abstract_factory.interfaces.impl;

import com.kcn.create.abstract_factory.interfaces.Mainboard;

/**
 * <p>Title: IntelMainboard</p>
 * <p>Description: Intel对主板接口的实现类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:20:43
 * @version 1.0
 */
public class IntelMainboard implements Mainboard {

	/**  
	* @Fields CPU插槽的孔数
	*/  
	private int cpuHoles = 0;
	
	/**
	 * 构造方法，传入cpu插槽的孔数
	 * @param cpuHoles
	 */
	public IntelMainboard(int cpuHoles) {
		
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		
		System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
	}

}
