/*
 * 文件名：SchedulerException.java
 * 版权：Copyright by www.fsmeeting.com
 * 描述：
 * 修改人：liuyc
 * 修改时间：2016年9月20日
 * 修改内容：
 */

package com.fsmeeting.scheduler.exception;

public class SchedulerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public SchedulerException() {
	super();
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public SchedulerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * @param message
     * @param cause
     */
    public SchedulerException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     */
    public SchedulerException(String message) {
	super(message);
    }

    /**
     * @param cause
     */
    public SchedulerException(Throwable cause) {
	super(cause);
    }

}
