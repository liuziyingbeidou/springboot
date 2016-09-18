package com.dto;

import java.util.Date;

/**
 * task Dto
 * @author liuzy
 *
 */
public class TestTaskDto {

	private String refId;
	private String taskData;
	private Date exeTime;
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getTaskData() {
		return taskData;
	}
	public void setTaskData(String taskData) {
		this.taskData = taskData;
	}
	public Date getExeTime() {
		return exeTime;
	}
	public void setExeTime(Date exeTime) {
		this.exeTime = exeTime;
	}
	
	
}
