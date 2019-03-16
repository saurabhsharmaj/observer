package com.ibit.appops.utils;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.ibit.appops.model.domain.ClusterNode;

public class ClusterNodeObserver implements PropertyChangeListener {
    
	
	public ClusterNodeObserver(ClusterNode model) {
		 model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
       if(event.getOldValue()!=event.getNewValue()){
    	System.out.println(((ClusterNode)event.getSource()).getClusterNodeId()+"Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
       }
    }
}