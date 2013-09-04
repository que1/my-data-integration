package mdi.common.job;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import mdi.common.job.step.Step;

public class JobData implements Serializable {

	private static final long serialVersionUID = 1356383627925754143L;

	private String jobName;
	private String schedExpression;
	private boolean isScheduled;
	private int connPoolSize;
	
	private List<Step> stepList;
	
	public JobData(String jobName) {
		this.jobName = jobName;
		this.stepList = new LinkedList<Step>();
	}

	public JobData(String jobName, String schedExpression) {
		this.jobName = jobName;
		this.schedExpression = schedExpression;
		this.stepList = new LinkedList<Step>();
	}

	public String getJobName() {
		return this.jobName;
	}

	public String getSchedExpression() {
		return this.schedExpression;
	}

	public void setSchedExpression(String schedExpression) {
		this.schedExpression = schedExpression;
	}

	public boolean isScheduled() {
		return this.isScheduled;
	}

	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	public int getConnPoolSize() {
		return this.connPoolSize;
	}

	public void setConnPoolSize(int connPoolSize) {
		this.connPoolSize = connPoolSize;
	}
	
	public Step getStep(int index) {
		return this.stepList.get(index);
	}
	
	
}
