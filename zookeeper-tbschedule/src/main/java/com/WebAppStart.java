package com;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.taobao.pamirs.schedule.strategy.TBScheduleManagerFactory;


/**
 * @author Alan Liu
 *
 */
@Configuration  
@ComponentScan  
@EnableAutoConfiguration 
public class WebAppStart {
	
	public static void main(String[] args) throws Exception {
 		SpringApplication.run(WebAppStart.class, args);
 		// 初始化Spring
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\main\\resources\\spring-bean-work.xml");
 
        // 初始化调度工厂
 		TBScheduleManagerFactory scheduleManagerFactory = new TBScheduleManagerFactory();

 		Properties p = new Properties();
 		p.put("zkConnectString", "192.168.244.128:2181");
		p.put("rootPath", "/data/app/ZookeeperLab/schedule");
		p.put("zkSessionTimeout", "60000");
		p.put("userName", "zookeeper");
		p.put("password", "zookeeper");
		p.put("isCheckParentPath", "true");
		 
		scheduleManagerFactory.setApplicationContext(ctx);
		 
		scheduleManagerFactory.init(p);  
	}

}
