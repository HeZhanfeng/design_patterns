package com.kcn.create.simple_factory.test;

import com.kcn.create.simple_factory.factory.CpuFactory;
import com.kcn.create.simple_factory.factory.MainboardFactory;
import com.kcn.create.simple_factory.interfaces.Cpu;
import com.kcn.create.simple_factory.interfaces.Mainboard;

/**
 * <p>Title: ComputerEngineer</p>
 * <p>Description: 装机工程师类</p>
 * @author	hezhanfeng
 * @date	2017年9月4日 下午5:41:05
 * @version 1.0
 */
public class ComputerEngineer {

	/**  
	* @Fields 定义组装机需要的CPU 
	*/  
	private Cpu cpu = null;
	
	/**  
	* @Fields 定义组装机需要的主板  
	*/  
	private Mainboard mainboard = null;
	
	/**  
	* @Title: makeComputer  
	* @Description: 组装机器的基本步骤：<br/>
	* 1:首先准备好装机所需要的配件;<br/>
	* 2:组装机器;<br/>
	* 3:测试机器;<br/>
	* 4:交付客户;<br/>
	* @param @param cpuType CPU的类型（"1-->Intel"或者"2-->AMD"）
	* @param @param mainboard    参数  
	* @return void    返回类型  
	* @throws  
	*/ 
	public void makeComputer(int cpuType, int mainboardType) {
		
		//1、准备装机所需的配件
		prepareHardwares(cpuType, mainboardType);
	}

	/**  
	* @Title: prepareHardwares  
	* @Description: 准备CPU和主板的类
	* @param @param cpuType CPU的类型（"1-->Intel"或者"2-->AMD"）
	* @param @param mainboardType    参数  
	* @return void    返回类型  
	* @throws  
	*/ 
	private void prepareHardwares(int cpuType, int mainboardType) {

		//这里要去准备cpu和主板的具体实现
		//装机工程师并不知道如何去创建，所以直接去找相应的工厂获取
		
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainboard = MainboardFactory.createMainboard(mainboardType);
		
		//测试配件是否好用
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
