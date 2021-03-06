package cn.hyyf.ssm.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.hyyf.ssm.domain.Person;
import cn.hyyf.ssm.service.PersonService;

@Controller
public class PersonController {
	
	Log logger= LogFactory.getLog(PersonController.class);
	
	@Resource
	PersonService personService;
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("person/listAll.action")
	public  String listAll(Model model){
		logger.debug("123");
		List personList = personService.listAll();
		model.addAttribute("personList", personList);
		
		return "/person/jPersonList";
	}
	/**
	 * 添加记录
	 * @param model
	 * @return
	 */
	@RequestMapping("person/addRecord.action")
	public  String addRecord(Model model){
		logger.debug("1233");
		Person p=new Person();
		p.setGender("测试");
		p.setUsername("测试");
		p.setAge(222);
		int re = personService.addRecord(p);
		System.out.println(re);
		model.addAttribute("message", "you can you up!");
		
		return "/person/addResult";
	}
	
	/**
	 * 添加或更新
	 * @param model
	 * @return
	 */
	@RequestMapping("person/saveOrUpdate.action")
	public  String saveOrUpdate(Model model){
		logger.debug("1233");
		Person p=new Person();
		p.setId(9090L);
		p.setGender("测试1");
		p.setUsername("测试1");
		p.setAge(222);
		int re = personService.saveOrUpdate(p);
		System.out.println(re);
		model.addAttribute("message", "you can you up!");
		
		return "/person/saveOrUpdte";
	}
	
	/**
	 * 查看个人信息详情
	 * @param id
	 * @return
	 */
	@RequestMapping(value="person/getDetail")
	public String details(Model model,@RequestParam("id") String id){
		Person person=personService.getDetail(id);
		model.addAttribute("person",person);
		return "/person/personDetail";
	}
	
		
	
	
}
