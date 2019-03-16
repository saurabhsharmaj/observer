package com.ibit.appops;

import com.ibit.appops.model.domain.ClusterNode;
import com.ibit.appops.utils.ClusterNodeObserver;

public class App {

	public static void main(String[] args) {
		ClusterNode cn = new ClusterNode();
		cn.setIsAvailable('1');
		ClusterNodeObserver ob = new ClusterNodeObserver(cn);
		
		cn.setIsAvailable('0');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('0');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('0');
	}

}
