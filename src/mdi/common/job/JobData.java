package mdi.common.job;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import mdi.common.job.step.StepData;

public class JobData implements Serializable {

	private static final long serialVersionUID = 1356383627925754143L;

	private String jobName;
	private String schedExpression;
	private boolean isScheduled;
	private int connPoolSize;
	
	private List<StepData> stepDataList;
	
	public JobData(String jobName) {
		this.jobName = jobName;
		this.stepDataList = new LinkedList<StepData>();
	}

	public JobData(String jobName, String schedExpression) {
		this.jobName = jobName;
		this.schedExpression = schedExpression;
		this.stepDataList = new LinkedList<StepData>();
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
	
	public StepData getStepData(int index) {
		return this.stepDataList.get(index);
	}
	
}
