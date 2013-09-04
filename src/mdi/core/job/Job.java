package mdi.core.job;

import mdi.common.job.JobData;

public class Job {

	private JobData jobData;
	
	public Job(JobData jobData) {
		this.jobData = jobData;
	}

	public JobData getJobData() {
		return this.jobData;
	}

	public void setJobData(JobData jobData) {
		this.jobData = jobData;
	}
	
}
