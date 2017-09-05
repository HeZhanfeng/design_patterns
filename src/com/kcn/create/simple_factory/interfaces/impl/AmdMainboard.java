package com.kcn.create.simple_factory.interfaces.impl;

import com.kcn.create.simple_factory.interfaces.Mainboard;

/**
 * <p>Title: AmdMainboard</p>
 * <p>Description: AMD对主板接口的实现类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:20:43
 * @version 1.0
 */
public class AmdMainboard implements Mainboard {

	/**  
	* @Fields CPU插槽的孔数
	*/  
	private int cpuHoles = 0;
	
	/**
	 * 构造方法，传入cpu插槽的孔数
	 * @param cpuHoles
	 */
	public AmdMainboard(int cpuHoles) {
		
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		
		System.out.println("Amd主板的CPU插槽孔数是：" + cpuHoles);
	}

}
