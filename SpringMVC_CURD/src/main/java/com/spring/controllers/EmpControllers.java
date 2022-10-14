package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.beans.Employees;
import com.spring.dao.EmpDao;

@Controller
public class EmpControllers{
	@Autowired
	EmpDao dao;
	
	
	@RequestMapping(value="/empform",  method=RequestMethod.GET)
	public String showForm(Model m){
		m.addAttribute("command", new Employees());
		//System.out.println("show Form");
		return "empform";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("emp")Employees emp){
		//System.out.println(emp.getEid());
		dao.save(emp);
		return "redirect:/viewemp";
	}
	@RequestMapping("/viewemp")
	public String viewemp(Model m){
		List<Employees> empList= dao.getEmployees();
		/*for(Employee e : empList){
			System.out.println(e.getEid());
		}*/
		m.addAttribute("empList",empList);
		return "viewemp";
	}
	
	@RequestMapping(value="/editemp/{eid}")
	public String edit(@PathVariable int eid, Model m){
		
		Employees emp=dao.getById(eid);
		m.addAttribute("command",emp);
		return "empeditform";
	}
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employees emp){
		
		System.out.println(emp.getId());
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="/deleteemp/{eid}")
	public String delete(@PathVariable int eid){
		dao.delete(eid);
		return "redirect:/viewemp";
	}

}
