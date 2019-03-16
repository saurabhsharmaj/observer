package com.ibit.appops;

import com.ibit.appops.model.domain.ClusterNode;
import com.ibit.appops.utils.ClusterNodeObserver;

public class App {

	public static void main(String[] args) {
		ClusterNode cn = new ClusterNode();
		cn.setClusterNodeId(101l);
		cn.setIsAvailable('1');
		ClusterNodeObserver ob = new ClusterNodeObserver(cn);
		
		ClusterNode cn2 = new ClusterNode();
		cn2.setClusterNodeId(102l);
		cn2.setIsAvailable('1');
		ClusterNodeObserver ob2 = new ClusterNodeObserver(cn2);
		
		
		cn.setIsAvailable('0');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn2.setIsAvailable('0');
		cn.setIsAvailable('1');
		cn2.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('1');
		cn.setIsAvailable('0');
	}

}
