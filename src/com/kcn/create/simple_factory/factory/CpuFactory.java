package com.kcn.create.simple_factory.factory;

import com.kcn.create.simple_factory.interfaces.Cpu;
import com.kcn.create.simple_factory.interfaces.impl.AmdCpu;
import com.kcn.create.simple_factory.interfaces.impl.IntelCpu;

/**
 * <p>Title: CpuFacetory</p>
 * <p>Description: CPU工厂类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:28:45
 * @version 1.0
 */
public class CpuFactory {
	
	/**  
	* @Title: createCpu  
	* @Description: 根据不同的type值，创建不同CPU厂商的cpu实例对象
	* @param @param type 1代表Intel厂的CPU，2代表AMD厂的CPU
	* @param @return    参数  
	* @return Cpu    返回类型  
	* @throws  
	*/ 
	public static Cpu createCpu(int type) {
		
		Cpu cpu = null;
		
		if(type == 1) {
			cpu = new IntelCpu(755);
		}else if(type == 2) {
			cpu = new AmdCpu(938);
		}
		
		return cpu;
	}
}
