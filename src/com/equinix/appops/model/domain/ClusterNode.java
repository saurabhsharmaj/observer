package com.equinix.appops.model.domain;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.Expose;

public class ClusterNode {
	
	@Expose private Long clusterNodeId;		
	@Expose private String nodeName;
	@Expose private String nodeType;
	@Expose private Character isAvailable;
	@Expose private Character status;
	@Expose private String monitorType;
	@Expose private String layerName;
	@Expose private String url;
	@Expose private String process;
	@Expose private String parentNodeId;
	@Expose private String hostname;
	@Expose private String userName;
	@Expose private String password;
	@Expose private String port;
	@Expose private String ipAddress;
	private Date createdDate;
	private Date updatedDate;
	@Expose private String createdBy;
	@Expose private String updatedBy;
	@Expose private String displayName;
	@Expose private String containerReplica;
	@Expose private Long clusterId;
	@Expose private String groupId;
	@Expose private String groupName;
	@Expose private String dockerContainerName;
	
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	
	private void notifyListeners(Object object, String property, Character oldValue, Character newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }
    
	public ClusterNode(){}

	public Long getClusterNodeId() {
		return clusterNodeId;
	}

	public void setClusterNodeId(Long clusterNodeId) {
		this.clusterNodeId = clusterNodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public Character getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Character isAvailable) {
		 notifyListeners(
                 this,
                 "isAvailable",
                 this.isAvailable,
                 this.isAvailable = isAvailable);
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public String getMonitorType() {
		return monitorType;
	}

	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLayerName() {
		return layerName;
	}

	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getParentNodeId() {
		return parentNodeId;
	}

	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getContainerReplica() {
		return containerReplica;
	}

	public void setContainerReplica(String containerReplica) {
		this.containerReplica = containerReplica;
	}

	public Long getClusterId() {
		return clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDockerContainerName() {
		return dockerContainerName;
	}

	public void setDockerContainerName(String dockerContainerName) {
		this.dockerContainerName = dockerContainerName;
	}
	
}
