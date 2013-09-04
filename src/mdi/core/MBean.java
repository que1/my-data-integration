package mdi.core;

import javax.management.ObjectName;

/**
 * interface of all mbeans
 * 
 */
public interface MBean {

	public void registerMBean() throws Exception;
	public void unregisterMBean() throws Exception;
	public ObjectName getObjectName();
	
}
