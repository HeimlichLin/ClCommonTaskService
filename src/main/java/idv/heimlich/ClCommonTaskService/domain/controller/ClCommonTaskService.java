package idv.heimlich.ClCommonTaskService.domain.controller;

import idv.heimlich.ClCommonTaskService.domain.code.CommonPeriodTasks;
import idv.heimlich.ClCommonTaskService.domain.service.impl.PeriodTaskService;

/**
 * 一般類型服務
 */
public class ClCommonTaskService {

	private static final String CL_COMMON_TASK_SERVICE = "ClCommonTaskService";

	public static void main(final String[] args) {

		PeriodTaskService service = new PeriodTaskService(
				CL_COMMON_TASK_SERVICE);
		// 一般後端作業
		for (final CommonPeriodTasks task : CommonPeriodTasks.values()) {
			service.addPeriodTask(task.getProcNo(), task.getPeriod(),
					task.getTaskClass());
		}
		service.start();
		service = null;
	}

}
