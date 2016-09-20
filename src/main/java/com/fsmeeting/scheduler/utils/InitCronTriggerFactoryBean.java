/*
 * 文件名：InitCronTriggerFactoryBean.java
 * 版权：Copyright by www.fsmeeting.com
 * 描述：
 * 修改人：liuyc
 * 修改时间：2016年9月20日
 * 修改内容：
 */

package com.fsmeeting.scheduler.utils;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

import com.fsmeeting.scheduler.exception.SchedulerException;

/**
 * 
 * 覆写触发工厂类
 * 
 * @author yicai.liu<moon>
 * @version 2016年9月20日
 * @see InitCronTriggerFactoryBean
 * @since
 */
public class InitCronTriggerFactoryBean extends CronTriggerFactoryBean implements Serializable {

    private static Logger LOG = LoggerFactory.getLogger(InitCronTriggerFactoryBean.class);
    private static final long serialVersionUID = 1L;

    @Override
    public void setCronExpression(String cronExpression) {
	if (StringUtils.isBlank(cronExpression)) {
	    throw new SchedulerException("CronExpression cannot be null!");
	}
	super.setCronExpression(loadCronExpression(cronExpression));
    }

    /**
     * 
     * Description:加载表达式 <br>
     * 
     * <pre>
     * if (cache)
     *     return cachedData;
     * return dbData;
     * </pre>
     * 
     * @param key
     * @return
     * @see
     */
    private String loadCronExpression(String key) {
	LOG.info("key:" + key);
	return "0/10 * * * * ?";
    }

}
