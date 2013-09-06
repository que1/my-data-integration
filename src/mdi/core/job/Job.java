package mdi.core.job;

import java.util.List;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;

import mdi.common.job.JobData;
import mdi.core.job.step.IStep;

public class Job {

	private JobData jobData;
	private List<IStep> stepList;
	
	private JobDetail jobDetail;
	private CronTrigger cronTrigger;
	
	public Job(JobData jobData) {
		this.jobData = jobData;
	}
	
	public void constructor() {
		//
	}

	public void destructor() {
		//
	}

	public void schedule() throws SchedulerException {
		
	}

	public void unscheduler() throws SchedulerException {
		
	}

	public void initExecuteCondition(Object... objects) {
		
	}

	public void clearExecuteCondition() {
		
	}

	public void execute() {
		
	}

	public JobData getJobData() {
		return this.jobData;
	}
	
}
