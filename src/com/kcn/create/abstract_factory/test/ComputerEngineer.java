package com.kcn.create.abstract_factory.test;

import com.kcn.create.abstract_factory.abstract_factory_interfaces.AbstractFactory;
import com.kcn.create.abstract_factory.interfaces.Cpu;
import com.kcn.create.abstract_factory.interfaces.Mainboard;

/**
 * <p>Title: ComputerEngineer</p>
 * <p>Description: 装机工程师类</p>
 * @author	hezhanfeng
 * @date	2017年9月5日 下午21:07:05
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
	* @param @param 
	* @return void    返回类型  
	* @throws  
	*/ 
	public void makeComputer(AbstractFactory af) {
		
		//1、准备装机所需的配件
		prepareHardwares(af);
	}

	/**  
	* @Title: prepareHardwares  
	* @Description: 准备CPU和主板的类
	* @return void    返回类型  
	* @throws  
	*/ 
	private void prepareHardwares(AbstractFactory af) {

		//这里要去准备cpu和主板的具体实现
		//装机工程师并不知道如何去创建，所以直接去找相应的工厂获取
		
		this.cpu = af.createCpu();
		this.mainboard = af.createMainboard();
		
		//测试配件是否好用
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
