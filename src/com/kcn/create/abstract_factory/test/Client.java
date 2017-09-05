package com.kcn.create.abstract_factory.test;

import com.kcn.create.abstract_factory.abstract_factory_interfaces.AbstractFactory;
import com.kcn.create.abstract_factory.abstract_factory_interfaces.impl.IntelFactory;

/**
 * <p>Title: Client</p>
 * <p>Description: 客户类</p>
 * @author	hezhanfeng
 * @date	2017年9月5日 下午9:16:12
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		//创建装机工程师对象
		ComputerEngineer cf = new ComputerEngineer();
		
		//客户选择并创建需要使用的产品对象
		AbstractFactory af = new IntelFactory();
		
		//告诉装机工程师自己选择的产品，让他组装电脑
		cf.makeComputer(af);
	}

}
