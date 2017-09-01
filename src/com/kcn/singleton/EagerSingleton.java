package com.kcn.singleton;

/**
 * <p>Title: EagerSingleton（饿汉式单例类）</p>
 * <p>Description: 饿汉式单例模式：<br/><br/>
 * 	在这个类被加载时，静态变量instance会被初始化，此时类的私有构造方法会被调用。这时候，单例类的唯一实例就被创建出来了。<br/>
 *  <b>饿汉式是典型的空间换时间</b>，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候就不需要再判断，节省了运行时间。
 * </p>
 * @author	hezhanfeng
 * @date	2017年9月1日 下午4:42:26
 * @version 1.0
 */
public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	/**
	 * 构造器私有化
	 */
	private EagerSingleton() {}
	
	// 静态工厂方法，返回单例类的唯一实例 
	public static EagerSingleton getInstance() {
		return instance;
	}
}
