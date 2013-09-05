package mdi.core.job.step;

import org.quartz.SchedulerException;

import mdi.common.job.ExecRule;
import mdi.common.job.ExecStatus;

public interface IStep {

	public int getStepIndex();
	
	public int getMaxThreadPoolSize();
	
	public ExecStatus getExecStatus();
	
	public ExecRule getExecRule();
	
	public boolean isNeedScheduled();
	
	//
	
	public void constructor();

	public void destructor();

	public void schedule() throws SchedulerException;

	public void unschedule() throws SchedulerException;

	public void initExecuteCondition(Object... objects);

	public void clearExecuteCondition();

	public void execute();
}
