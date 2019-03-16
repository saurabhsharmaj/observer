package com.equinix.appops.utils;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.equinix.appops.model.domain.ClusterNode;

public class ClusterNodeObserver implements PropertyChangeListener {
    
	public ClusterNodeObserver(ClusterNode model) {
		 model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
       if(event.getOldValue()!=event.getNewValue())
    	System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
    }
}