package com.kcn.create.simple_factory.factory;

import com.kcn.create.simple_factory.interfaces.Mainboard;
import com.kcn.create.simple_factory.interfaces.impl.AmdMainboard;
import com.kcn.create.simple_factory.interfaces.impl.IntelMainboard;

/**
 * <p>Title: MainboardFacetory</p>
 * <p>Description: 主板工厂类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:28:45
 * @version 1.0
 */
public class MainboardFactory {
	
	/**  
	* @Title: createMainboard  
	* @Description: 根据不同的type值，创建不同主板厂商的主板实例对象
	* @param @param type 1代表Intel厂的主板，2代表AMD厂的主板
	* @param @return    参数  
	* @return Mainboard    返回类型  
	* @throws  
	*/ 
	public static Mainboard createMainboard(int type) {
		
		Mainboard mainboard = null;
		
		if(type == 1) {
			mainboard = new IntelMainboard(755);
		}else if(type == 2) {
			mainboard = new AmdMainboard(938);
		}
		
		return mainboard;
	}
}
