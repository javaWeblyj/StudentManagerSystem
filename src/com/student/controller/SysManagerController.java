package com.student.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.util.Page;
import com.student.pojo.SysManager;
import com.student.service.SysManagerService;

@Controller
@RequestMapping("")
public class SysManagerController {

	@Autowired
	SysManagerService sysManagerService;
	
	@Test
	@RequestMapping("updateSysManager")
	public ModelAndView updateSysManger(SysManager sysManager) {
		sysManagerService.updateByPrimaryKey(sysManager);
//		System.out.println("执行到这里来了*****************************");
		ModelAndView mav = new ModelAndView("redirect:/showAllSysManager");
		return mav;
	}
	
	@Test
	@RequestMapping("editSysManger")
	public ModelAndView editSysManger(SysManager sysManager) {
		
//		listCategory.jsp 提交的 id 会自动注入到参数 category 里,通过 此 id 获取 对应数据库记录赋值给 c
		SysManager sm = sysManagerService.selectByPrimaryKey(sysManager.getMan_id());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");
		String now = df.format(new Date());
		System.out.print(now);
		System.out.println(sm);
		// 默认 forward（直接转发） 转发到编辑页面，参数 c 会默认被当做值加入到 ModelAndView 中一起发出
		ModelAndView mav = new ModelAndView("editSysManager");
		mav.addObject("sm", sm);
		return mav;
	}
	
	@Test
	@RequestMapping("addSysManager")
	public ModelAndView addSysManager(SysManager sysManager) {
		System.out.println("准备要插入的信息：" + sysManager);
		sysManagerService.add(sysManager);
		ModelAndView mav = new ModelAndView("redirect:/showAllSysManager");
		return mav;
	}
	
	@Test
	@RequestMapping("deleteSysManger")
	public ModelAndView deleteSysManger(SysManager sysManager) {
		System.out.println("准备要删除的信息：" + sysManager);
		
		int s =sysManagerService.deleteByPrimaryKey(sysManager.getMan_id());
		
		System.out.println("删除的信息：" + sysManager +
				"，s的值是：" +s);
		// 重定向到显示页面
		ModelAndView mav = new ModelAndView("redirect:/showAllSysManager");
		return mav;
	}
	
	
	
	@Test
	@RequestMapping("showAllSysManager")
	public ModelAndView showAllSysManager(Page page) {
		ModelAndView mav = new ModelAndView();
		// ModelAndView 类用来存储处理完后的结果数据，以及显示该数据的视图
		
		// 使用分页插件 Pagehelper
		PageHelper.offsetPage(page.getStart(), 10);
		     
		List<SysManager> sm = sysManagerService.list();
        
        int total = (int) new PageInfo<>(sm).getTotal();
        page.calculateLast(total);
		
		// 在 ModelAndView 中加入转发参数(属性) ，参数(属性)别名为 sm，方便前台调用
		mav.addObject("sm", sm);
		
		// 默认为 forward 模式  		
		mav.setViewName("showAllSysManager");
		// 执行完这个方法以后，直接转发到 setViewName 指定的页面 listCategory
		return mav;
	}
	
	// 登陆
	@Test
	@RequestMapping("login")
	public ModelAndView login(SysManager sysManager) {
		ModelAndView mav = new ModelAndView();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("manId", sysManager.getMan_id());
		map.put("manPsd", sysManager.getMan_psd());
		
/*		DateFormat df = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");
		String now = df.format(new Date());
		System.out.print(now);*/
		System.out.println(map);
		
		SysManager sm = sysManagerService.login(map);
		if(sm != null){
			// 登录成功，跳转到主页面
			java.sql.Date sdate;	// 数据库支持类型
			java.util.Date udate;
			udate = new java.util.Date();	// 获取系统时间
/*			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String now = df.format(udate);
			System.out.println(now + ":" + map);*/
			
			sdate = new java.sql.Date(udate.getTime());	// 类型转换
			sysManager.setMan_login(sdate);			
			sysManagerService.updateLogin(sysManager);
			mav.setViewName("index");
			mav.addObject("sm", sm);
			
		} else {
			// 登录失败，回到登录页面
			mav.addObject("message", "用户名或密码错误，请重新输入！");
			mav.setViewName("login");
		}
		return mav;
	}
}
