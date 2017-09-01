package com.kcn.singleton;

/**
 * <p>Title: Singleton</p>
 * <p>Description: 单例模式：(时间空间都不浪费)<br/><br/>
 * 由于饿汉式浪费空间、懒汉式的实现又是线程安全的，这样会降低整个访问的速度，而且每次都要判断。<br/>
 * 所以我们使用一种能够延迟加载且线程安全的模式。<br/>
 * 采用静态初始化器的方式，让JVM来保证线程的安全性。<br/>
 * 采用类级内部类的方式来保证对象实例只有一个。（类级内部类只要不使用到这个内部类，那么就不会创建对象实例）
 * </p>
 * @author	hezhanfeng
 * @date	2017年9月1日 下午5:49:09
 * @version 1.0
 */
public class Singleton {
	
	/**
	 * 构造方法私有化
	 */
	private Singleton() {}
	
	/**
	 * <p>Title: SingletonHolder</p>
	 * <p>Description: 类级内部类，用来保证对象只被创建一次</p>
	 * @author	hezhanfeng
	 * @date	2017年9月1日 下午6:25:44
	 * @version 1.0
	 */
	private static class SingletonHolder{
		
		/**  
		* 静态初始化器，由JVM来保证线程安全  
		*/  
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		
		return SingletonHolder.instance;
	}
	
}
