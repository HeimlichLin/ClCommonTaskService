package idv.heimlich.ClCommonTaskService.domain.service.impl;

import idv.heimlich.ClCommonTaskService.domain.service.Task;
import idv.heimlich.ClCommonTaskService.domain.service.TaskContext;

/**
 * 通用任務[無須客製化]
 */
public class CommonTask implements Task {

	private final Task task;

	final TaskContext jobStatus;

	public CommonTask(final Task task, final TaskContext jobStatus) {
		this.task = task;
		this.jobStatus = jobStatus;
	}

	@Override
	public void execute() {
		this.jobStatus.execute(this.task);
	}

}
