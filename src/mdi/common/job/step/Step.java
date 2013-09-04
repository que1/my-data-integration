package mdi.common.job.step;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mdi.common.job.step.parallel.ParallelTask;

public class Step implements Serializable {

	private static final long serialVersionUID = -4639923908686211013L;

	private int stepIndex;
	private String stepName;
	private String schedExpression;
	private int threadPoolSize;

	private List<ParallelTask> parallelTaskList;

	public Step(String stepName) {
		this.stepName = stepName;
		this.parallelTaskList = new ArrayList<ParallelTask>();
	}

	public Step(int stepIndex, String stepName) {
		this.stepIndex = stepIndex;
		this.stepName = stepName;
		this.parallelTaskList = new ArrayList<ParallelTask>();
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

	public ParallelTask getParallelTask(String parallelTaskName) {
		for (ParallelTask parallelTask : this.parallelTaskList) {
			if (parallelTask.getParallelTaskName().equals(parallelTaskName)) {
				return parallelTask;
			} else {
				continue;
			}
		}
		return null;
	}

	public void addParallelTask(ParallelTask parallelTask) {
		this.parallelTaskList.add(parallelTask);
	}

	public void removeParallelTask(String parallelTaskName) {
		int index = -1;
		for (ParallelTask parallelTask : this.parallelTaskList) {
			index++;
			if (parallelTask.getParallelTaskName().equals(parallelTaskName)) {
				break;
			}
		}
		
		if (index > -1) {
			this.parallelTaskList.remove(index);
		} else {
			return;
		}
	}
}
