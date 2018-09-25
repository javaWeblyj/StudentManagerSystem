package com.student.controller;


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
import com.student.pojo.Student;
import com.student.service.StudentService;
import com.student.util.Page;

@Controller
@RequestMapping("")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@Test
	@RequestMapping("selectToShowStudent")
	public ModelAndView selectToShowStuClass(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		String cId = request.getParameter("c_id");
		// ModelAndView 类用来存储处理完后的结果数据，以及显示该数据的视图
		Integer c = Integer.valueOf(cId);	
		List<Student> st = studentService.selectByCID(c);		
		mav.addObject("st", st);
		
		// 默认为 forward 模式  		
		mav.setViewName("selectToShowStudent");
		// 执行完这个方法以后，直接转发到 setViewName 指定的页面 listCategory
		return mav;
	}
	
	
	@RequestMapping("batchDelStudent")
	public void batchDeletes(HttpServletRequest request, HttpServletResponse response) {
		String items = request.getParameter("delItems");
		System.out.println(items);
		String[] strs = items.split(",");
		for (int i = 0; i < strs.length; i++) {
			try {
				String id = strs[i];
				studentService.deleteByPrimaryKey(id);
			} catch (Exception e) {
			}
		}
	}

 
	
	@Test
	@RequestMapping("updateStudent")
	public ModelAndView updateStudent(Student student) {
		System.out.println("更新后学生信息："+student);
		studentService.update(student);
		System.out.println("执行到这里来了更新学生信息*****************************");
		ModelAndView mav = new ModelAndView("redirect:/showAllStudent");
		return mav;
	}
	
	@Test
	@RequestMapping("editStudent")
	public ModelAndView editStudent(Student student) {
//		listCategory.jsp 提交的 id 会自动注入到参数 category 里,通过 此 id 获取 对应数据库记录赋值给 c
		Student st = studentService.selectByPrimaryKey(student.getStu_id());		
		// 默认 forward（直接转发） 转发到编辑页面，参数 c 会默认被当做值加入到 ModelAndView 中一起发出
		ModelAndView mav = new ModelAndView("editStudent");
		mav.addObject("st", st);
		return mav;
	}
	
	@Test
	@RequestMapping("addStudent")
	public ModelAndView addStudent(Student student) {
		ModelAndView mav = new ModelAndView();
		System.out.println("准备要插入的信息：" + student);
		List<Integer> cids = studentService.listCID();
		System.out.println(cids);
		if( cids.contains(student.getC_id()) ){
			studentService.insert(student);
			mav.addObject("redirect:/showAllStudent");			
		} else {
			mav.addObject("error","输入班级编号错误！");
		}
		return mav;
	}
	
	
	@Test
	@RequestMapping("deleteStudent")
	public ModelAndView deleteStudent(Student student) {
		System.out.println("准备要删除的信息：" + student);
		int s = studentService.updateDelete(student);		
		System.out.println("删除的信息：" + student +
				"，s的值是：" +s);
		// 重定向到显示页面
		ModelAndView mav = new ModelAndView("redirect:/showAllStudent");
		return mav;
	}
		
	@Test
	@RequestMapping("showAllStudent")
	public ModelAndView showAllStudent(Page page) {
		ModelAndView mav = new ModelAndView();
		// ModelAndView 类用来存储处理完后的结果数据，以及显示该数据的视图
		
		// 使用分页插件 Pagehelper
		PageHelper.offsetPage(page.getStart(), 10);
		     
		List<Student> st = studentService.list();
        int total = (int) new PageInfo<>(st).getTotal();
        page.calculateLast(total);
		// 在 ModelAndView 中加入转发参数(属性) ，参数(属性)别名为 sm，方便前台调用
		mav.addObject("st", st);
		
		// 默认为 forward 模式  		
		mav.setViewName("showAllStudent");
		// 执行完这个方法以后，直接转发到 setViewName 指定的页面 listCategory
		return mav;
	}
	
}
