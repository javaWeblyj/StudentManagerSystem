package com.student.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.pojo.StuClass;
import com.student.service.StuClassService;
import com.student.util.Page;

@Controller
@RequestMapping("")
public class StuClassController {
	
	@Autowired
	StuClassService stuClassService;
	
	@RequestMapping("batchDelstuClass")
	public void batchDeletes(HttpServletRequest request, HttpServletResponse response) {
		String items = request.getParameter("delItems");
		System.out.println(items);
		String[] strs = items.split(",");
		System.out.println(strs.length + "***********************************************8");
		for (int i = 0; i < strs.length; i++) {
			try {
				String id = strs[i];
				stuClassService.deleteById(id);
			} catch (Exception e) {
			}
		}
	}

	
	@Test
	@RequestMapping("updateStuClass")
	public ModelAndView updateStuClass(StuClass stuClass) {
		System.out.println("执行到这里来了*****************************");
		stuClassService.updateByPrimaryKey(stuClass);
		ModelAndView mav = new ModelAndView("redirect:/showAllStuClass");
		return mav;
	}
	
	@Test
	@RequestMapping("editStuClass")
	public ModelAndView editStuClass(StuClass stuClass) {
//		listCategory.jsp 提交的 id 会自动注入到参数 category 里,通过 此 id 获取 对应数据库记录赋值给 c
		StuClass sc = stuClassService.selectByPrimaryKey(stuClass.getClass_id());
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");
		String now = df.format(new Date());
		System.out.print(now);
		System.out.println(sc);
		
		// 默认 forward（直接转发） 转发到编辑页面，参数 c 会默认被当做值加入到 ModelAndView 中一起发出
		ModelAndView mav = new ModelAndView("editStuClass");
		mav.addObject("sc", sc);
		return mav;
	}
	
	@Test
	@RequestMapping("addStuClass")
	public ModelAndView addStuClass(StuClass stuClass) {
		System.out.println("准备要插入的信息：" + stuClass);
		stuClassService.insert(stuClass);
		ModelAndView mav = new ModelAndView("redirect:/showAllStuClass");
		return mav;
	}
	
	@Test
	@RequestMapping("deleteStuClass")
	public ModelAndView deleteSysManger(StuClass stuClass) {
		System.out.println("准备要删除的信息：" + stuClass);
		
		int s = stuClassService.deleteByPrimaryKey(stuClass.getClass_id());
		
		System.out.println("删除的信息：" + stuClass +
				"，s的值是：" +s);
		// 重定向到显示页面
		ModelAndView mav = new ModelAndView("redirect:/showAllStuClass");
		return mav;
	}
	
	@Test
	@RequestMapping("selectToShowStuClass")
	public ModelAndView selectToShowStuClass(StuClass stuClass) {
		ModelAndView mav = new ModelAndView();
		// ModelAndView 类用来存储处理完后的结果数据，以及显示该数据的视图
		StuClass sc = stuClassService.selectByPrimaryKey(stuClass.getClass_id());
		
		mav.addObject("sc", sc);
		
		// 默认为 forward 模式  		
		mav.setViewName("selectToShowStuClass");
		// 执行完这个方法以后，直接转发到 setViewName 指定的页面 listCategory
		return mav;
	}
	
	
	@Test
	@RequestMapping("showAllStuClass")
	public ModelAndView showAllSysManager(Page page) {
		ModelAndView mav = new ModelAndView();
		// ModelAndView 类用来存储处理完后的结果数据，以及显示该数据的视图
		
		// 使用分页插件 Pagehelper
		PageHelper.offsetPage(page.getStart(), 10);
		     
		List<StuClass> sc = stuClassService.list();
        int total = (int) new PageInfo<>(sc).getTotal();
        page.calculateLast(total);
//888888888888888888888888888888888888888888888888888888888888888
		// 在 ModelAndView 中加入转发参数(属性) ，参数(属性)别名为 sm，方便前台调用
		mav.addObject("sc", sc);
		
		// 默认为 forward 模式  		
		mav.setViewName("showAllStuClass");
		// 执行完这个方法以后，直接转发到 setViewName 指定的页面 listCategory
		return mav;
	}
}
