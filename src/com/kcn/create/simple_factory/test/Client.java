package com.kcn.create.simple_factory.test;

/**
 * <p>Title: Client</p>
 * <p>Description: 客户类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:56:24
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		ComputerEngineer cf = new ComputerEngineer();
		cf.makeComputer(1, 2);
		cf.makeComputer(1, 1);
		cf.makeComputer(2, 1);
		cf.makeComputer(2, 2);
	}
}
