package com.kcn.singleton;

/**
 * <p>Title: LazySingleton（懒汉式单例类）</p>
 * <p>Description: 懒汉式单例模式：<br/><br/>
 * 此处懒汉式单例类实现里对静态工厂方法使用了同步化，以处理多线程环境;<br/>
 * 懒汉式其实是一种比较形象的称谓。既然懒，那么在创建对象实例的时候就不着急。<br/>会一直等到马上要使用对象实例的时候才会创建，懒人嘛，总是推脱不开的时候才会真正去执行工作，因此在装载对象的时候不创建对象实例。<br/>
 * <b>懒汉式是典型的时间换空间</b>，就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间。
 * </p>
 * @author	hezhanfeng
 * @date	2017年9月1日 下午5:11:14
 * @version 1.0
 */
public class LazySingleton {

	private static LazySingleton instance = null;
	
	/**
	 * 构造方法私有化
	 */
	private LazySingleton() {}
	
	// 静态工厂方法，返回单例类的唯一实例   
	public static synchronized LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
