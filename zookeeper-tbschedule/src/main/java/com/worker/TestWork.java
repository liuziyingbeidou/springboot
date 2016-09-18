package com.worker;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.dto.TestTaskDto;
import com.google.common.collect.Lists;
import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;
import com.taobao.pamirs.schedule.TaskItemDefine;

public class TestWork implements IScheduleTaskDealSingle<TestTaskDto> {

	public Comparator<TestTaskDto> getComparator() {
		System.out.println("");
		return null;
	}

	public List<TestTaskDto> selectTasks(String taskParameter, String ownSign,
			int taskItemNum, List<TaskItemDefine> queryCondition,
			int eachFetchDataNum) throws Exception {
		System.out.println("开始>>>>>>获取任务.....");
		List<TestTaskDto> listTaskDto = Lists.newArrayList();
		TestTaskDto testTaskDto = null;
		for(int i = 0; i < 5; i++){
			testTaskDto = new TestTaskDto();
			testTaskDto.setRefId("test_"+i);
			testTaskDto.setTaskData("data_"+i);
			testTaskDto.setExeTime(new Date());
			listTaskDto.add(testTaskDto);
		}
		System.out.println("结束>>>>>>获取任务....."+listTaskDto.size());
		return listTaskDto;
	}

	public boolean execute(TestTaskDto testTaskDto, String arg1) throws Exception {
		System.out.println("开始>>>>>执行任务.....");
		System.out.println("=====任务数据："+testTaskDto.getTaskData());
		System.out.println("结束>>>>>执行任务.....");
		return true;
	}

}
