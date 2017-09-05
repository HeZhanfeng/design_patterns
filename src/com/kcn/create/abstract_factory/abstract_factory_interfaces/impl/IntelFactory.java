package com.kcn.create.abstract_factory.abstract_factory_interfaces.impl;

import com.kcn.create.abstract_factory.abstract_factory_interfaces.AbstractFactory;
import com.kcn.create.abstract_factory.interfaces.Cpu;
import com.kcn.create.abstract_factory.interfaces.Mainboard;
import com.kcn.create.abstract_factory.interfaces.impl.IntelCpu;
import com.kcn.create.abstract_factory.interfaces.impl.IntelMainboard;

/**
 * <p>Title: IntelFactory</p>
 * <p>Description: 抽象工厂接口Intel工厂实现类</p>
 * <p>Company: www.campnano.com</p> 
 * @author	hezhanfeng
 * @date	2017年9月5日 下午8:58:48
 * @version 1.0
 */
public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		
		return new IntelMainboard(755);
	}

}
