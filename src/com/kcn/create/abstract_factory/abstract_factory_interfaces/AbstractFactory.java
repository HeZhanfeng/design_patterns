package com.kcn.create.abstract_factory.abstract_factory_interfaces;

import com.kcn.create.abstract_factory.interfaces.Cpu;
import com.kcn.create.abstract_factory.interfaces.Mainboard;

/**
 * <p>Title: AbstractFactory</p>
 * <p>Description: 抽象工厂接口</p>
 * @author	hezhanfeng
 * @date	2017年9月5日 下午8:33:57
 * @version 1.0
 */
public interface AbstractFactory {
	
	/**  
	* @Title: createCpu  
	* @Description: 创建CPU对象  
	* @return CPU对象 
	* @throws  
	*/ 
	public Cpu createCpu();
	
	/**  
	* @Title: createMainboard  
	* @Description: 创建主板对象 
	* @return 主板对象 
	* @throws  
	*/ 
	public Mainboard createMainboard();
}
