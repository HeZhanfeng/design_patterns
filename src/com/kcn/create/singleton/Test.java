package com.kcn.create.singleton;

/**
 * <p>Title: Test</p>
 * <p>Description:单例模式测试类</p>
 * @author	hezhanfeng
 * @date	2017年9月1日 下午6:30:32
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(EagerSingleton.getInstance());
		System.out.println(LazySingleton.getInstance());
		System.out.println(Singleton.getInstance());
	}
}
