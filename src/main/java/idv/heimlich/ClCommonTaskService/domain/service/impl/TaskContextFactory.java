package idv.heimlich.ClCommonTaskService.domain.service.impl;

import idv.heimlich.ClCommonTaskService.domain.service.TaskContext;

public class TaskContextFactory {

	public static TaskContext getContext(final String procNo) {
		return new TaskFileContext(
				procNo.replaceAll("/", "_").replace("\\", "_"));
	}

}
