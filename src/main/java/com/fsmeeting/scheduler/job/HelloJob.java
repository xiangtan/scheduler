package com.fsmeeting.scheduler.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisallowConcurrentExecution
public class HelloJob implements Job {

    private static Logger LOG = LoggerFactory.getLogger(HelloJob.class);

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
	// 此任务仅打印日志便于调试、观察
	LOG.debug(this.getClass().getName() + " trigger...");
    }

}