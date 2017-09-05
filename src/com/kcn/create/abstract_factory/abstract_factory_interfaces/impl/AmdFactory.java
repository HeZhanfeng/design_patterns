package com.kcn.create.abstract_factory.abstract_factory_interfaces.impl;

import com.kcn.create.abstract_factory.abstract_factory_interfaces.AbstractFactory;
import com.kcn.create.abstract_factory.interfaces.Cpu;
import com.kcn.create.abstract_factory.interfaces.Mainboard;
import com.kcn.create.abstract_factory.interfaces.impl.AmdCpu;
import com.kcn.create.abstract_factory.interfaces.impl.AmdMainboard;

/**
 * <p>Title: AmdFactory</p>
 * <p>Description: 抽象工厂接口AMD工厂实现类</p>
 * @author	hezhanfeng
 * @date	2017年9月5日 下午8:57:36
 * @version 1.0
 */
public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {

		return new AmdCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AmdMainboard(938);
	}

}
