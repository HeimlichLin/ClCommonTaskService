package idv.heimlich.ClCommonTaskService.domain.code;

import idv.heimlich.ClCommonTaskService.domain.service.AbtractTask;

/****
 * 週期任務表
 */
public enum CommonPeriodTasks {

//	clBackendMonitor(BackendMonitorTask.class, 5 * 60l), // 後端訊息監控
	// clMailService(MailServiceTask.class, 5 * 60l), // 寄信服務
	// clCheckTaskStatus(CheckTaskStatusTask.class, 5 * 60l), // 檢查後端任務狀況
//	clJobCmd(JobCmdTask.class, 5 * 60l), // Job comd命令
//	clRecvlogCheck(RecvlogCheckTask.class, 60 * 60l), // Recvlog 檢查
//	clBumpFile(BumpFileTask.class, 60 * 60l), // 碰檔程式，包含放行、傳送註記l
	;//

	final String procNo;
	final Long period;
	final Class<? extends AbtractTask> taskClass;

	/**
	 *
	 * @param procNo
	 * @param period
	 * @param taskClass
	 */
	private CommonPeriodTasks(final Class<? extends AbtractTask> taskClass,
			final Long period) {

		this.taskClass = taskClass;
		this.period = period;
		this.procNo = this.name();

	}

	public String getProcNo() {
		return this.procNo;
	}

	public Long getPeriod() {
		return this.period;
	}

	public Class<? extends AbtractTask> getTaskClass() {
		return this.taskClass;
	}

}
