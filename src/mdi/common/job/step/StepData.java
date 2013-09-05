package mdi.common.job.step;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mdi.common.job.step.parallel.ParallelTaskData;

public class StepData implements Serializable {

	private static final long serialVersionUID = -4639923908686211013L;

	private int stepIndex;
	private String stepName;
	private String schedExpression;
	private int threadPoolSize;

	private List<ParallelTaskData> parallelTaskDataList;

	public StepData(String stepName) {
		this.stepName = stepName;
		this.parallelTaskDataList = new ArrayList<ParallelTaskData>();
	}

	public StepData(int stepIndex, String stepName) {
		this.stepIndex = stepIndex;
		this.stepName = stepName;
		this.parallelTaskDataList = new ArrayList<ParallelTaskData>();
	}

	public int getStepIndex() {
		return this.stepIndex;
	}

	public void setStepIndex(int stepIndex) {
		this.stepIndex = stepIndex;
	}

	public String getStepName() {
		return this.stepName;
	}

	public String getSchedExpression() {
		return this.schedExpression;
	}

	public void setSchedExpression(String schedExpression) {
		this.schedExpression = schedExpression;
	}

	public int getThreadPoolSize() {
		return this.threadPoolSize;
	}

	public void setThreadPoolSize(int threadPoolSize) {
		this.threadPoolSize = threadPoolSize;
	}

	public ParallelTaskData getParallelTaskData(String parallelTaskName) {
		for (ParallelTaskData parallelTaskData : this.parallelTaskDataList) {
			if (parallelTaskData.getParallelTaskName().equals(parallelTaskName)) {
				return parallelTaskData;
			} else {
				continue;
			}
		}
		return null;
	}

	public void addParallelTaskData(ParallelTaskData parallelTaskData) {
		this.parallelTaskDataList.add(parallelTaskData);
	}

	public void removeParallelTaskData(String parallelTaskName) {
		int index = -1;
		for (ParallelTaskData parallelTaskData : this.parallelTaskDataList) {
			index++;
			if (parallelTaskData.getParallelTaskName().equals(parallelTaskName)) {
				break;
			}
		}
		
		if (index > -1) {
			this.parallelTaskDataList.remove(index);
		} else {
			return;
		}
	}
}
