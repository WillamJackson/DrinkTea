package com.example.demo.api.activitiapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping(value = "/api/Deployment",method=RequestMethod.POST)
public class DeploymentApi {
	
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private RepositoryService repositoryService;
	
	public String startActivityDemo() {  
        System.out.println("method startActivityDemo begin....");  
        
        System.out.println( "调用流程存储服务，查询部署数量："
                + repositoryService.createDeploymentQuery().count());
        Map<String,Object> map = new HashMap<String,Object>();  
        map.put("apply","zhangsan");  
        map.put("approve","lisi");  
        
        //流程启动  
        runtimeService.startProcessInstanceByKey("leave",map);  
       
        List<Task> tq=taskService.createTaskQuery().taskAssignee("zhangsan").list();
        System.out.println(tq.size());
        String assignee = "zhangsan";//当前任务办理人  
        List<Task> tasks = taskService//与任务相关的Service  
                .createTaskQuery()//创建一个任务查询对象  
                .taskAssignee(assignee)  
                .list();  
        if(tasks !=null && tasks.size()>0){  
            for(Task task:tasks){  
                System.out.println("任务ID:"+task.getId());  
                System.out.println("任务的办理人:"+task.getAssignee());  
                System.out.println("任务名称:"+task.getName());  
                System.out.println("任务的创建时间:"+task.getCreateTime());  
 
                System.out.println("流程实例ID:"+task.getProcessInstanceId());
                System.out.println("#####################################");  
            }  
        }  
     
        System.out.println("method startActivityDemo end....");  
        return "Hi MyBella";  
	}
}
